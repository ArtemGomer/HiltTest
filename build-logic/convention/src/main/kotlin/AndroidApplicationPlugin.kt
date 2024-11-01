import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.findPlugin("android-application").get().get().pluginId)
            }

            applicationExtension.apply {
                configureAndroid(commonExtension = this)
                defaultConfig {
                    targetSdk = libs.findVersion("targetSdk").get().toString().toInt()
                    applicationId = "me.gomer.hilttest"
                    versionCode = 1
                    versionName = "1.0"
                }
            }

            configureKotlin()
        }
    }
}