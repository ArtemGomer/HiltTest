import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinJVMPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.findPlugin("jetbrains-kotlin-jvm").get().get().pluginId)
                apply("org.gradle.java-library")
            }
            configureKotlin()
        }
    }
}