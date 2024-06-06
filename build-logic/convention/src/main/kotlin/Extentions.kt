import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

internal val Project.applicationExtension: ApplicationExtension?
    get() = extensions.findByType<ApplicationExtension>()

internal val Project.libraryExtension: LibraryExtension?
    get() = extensions.findByType<LibraryExtension>()

internal val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal fun Project.configureAndroid(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        compileSdk = libs.findVersion("compileSdk").get().toString().toInt()
        defaultConfig {
            minSdk = libs.findVersion("minSdk").get().toString().toInt()
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


