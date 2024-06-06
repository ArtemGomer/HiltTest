import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.findPlugin("android-application").get().get().pluginId)
                apply(libs.findPlugin("jetbrains-kotlin-android").get().get().pluginId)
            }

            requireNotNull(applicationExtension).apply {
                configureAndroid(commonExtension = this)
                defaultConfig.targetSdk = libs.findVersion("targetSdk").get().toString().toInt()
                buildFeatures {
                    viewBinding = true
                }
            }

            configureKotlin()
        }
    }
}