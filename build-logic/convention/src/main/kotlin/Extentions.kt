import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.plugins.PluginInstantiationException
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.findByType
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

internal val Project.applicationExtension: ApplicationExtension
    get() = extensions.findByType<ApplicationExtension>()
        ?: throw PluginInstantiationException("Can only be applied on an android Application")

internal val Project.libraryExtension: LibraryExtension
    get() = extensions.findByType<LibraryExtension>()
        ?: throw PluginInstantiationException("Can only be applied on an android Library")

internal val Project.libs: VersionCatalog
    get() = extensions.findByType<VersionCatalogsExtension>()?.named("libs")
        ?: throw PluginInstantiationException("No version catalog installed with name `libs`")

internal fun Project.configureAndroid(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    pluginManager.apply(libs.findPlugin("jetbrains-kotlin-android").get().get().pluginId)
    commonExtension.apply {
        compileSdk = libs.findVersion("compileSdk").get().toString().toInt()
        defaultConfig {
            minSdk = libs.findVersion("minSdk").get().toString().toInt()
        }
        buildFeatures {
            viewBinding = true
        }
    }
}

internal fun Project.configureKotlin() {
    extensions.configure<KotlinProjectExtension> {
        jvmToolchain(17)
    }
}

internal fun Project.configureHilt() {
    with(pluginManager) {
        apply(libs.findPlugin("hilt").get().get().pluginId)
        apply(libs.findPlugin("ksp").get().get().pluginId)
    }

    dependencies {
        add(
            "implementation",
            libs.findLibrary("hilt-android").get(),
        )
        add(
            "ksp",
            libs.findLibrary("hilt-compiler").get(),
        )
    }
}


