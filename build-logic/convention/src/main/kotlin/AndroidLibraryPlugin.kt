import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidLibraryPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.findPlugin("android-library").get().get().pluginId)
                apply(libs.findPlugin("jetbrains-kotlin-android").get().get().pluginId)
            }

            requireNotNull(libraryExtension).apply {
                configureAndroid(commonExtension = this)
                buildFeatures {
                    viewBinding = true
                }
            }

            configureKotlin()
        }
    }
}