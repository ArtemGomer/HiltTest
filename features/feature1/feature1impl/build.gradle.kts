plugins {
    id("me.gomer.plugin.android.library")
    id("me.gomer.plugin.hilt")
}

android {
    namespace = "me.gomer.feature1impl"

    defaultConfig {

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(libs.androidx.fragment.ktx)

    implementation(projects.features.feature2.feature2api)
    implementation(projects.features.feature1.feature1api)
}