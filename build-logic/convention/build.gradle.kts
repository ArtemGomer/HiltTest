plugins {
    `kotlin-dsl`
}

group = "me.gomer.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("appAndroidJVM") {
            id = "me.gomer.plugin.kotlin-java"
            implementationClass = "KotlinJVMPlugin"
        }
        register("appAndroidLibrary") {
            id = "me.gomer.plugin.android.library"
            implementationClass = "AndroidLibraryPlugin"
        }
        register("appHilt") {
            id = "me.gomer.plugin.hilt"
            implementationClass = "HiltPlugin"
        }
        register("appAndroidApplication") {
            id = "me.gomer.plugin.android.application"
            implementationClass = "AndroidApplicationPlugin"
        }
    }
}