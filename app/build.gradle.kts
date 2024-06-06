plugins {
    id("me.gomer.plugin.android.application")
    id("me.gomer.plugin.hilt")
}

android {
    namespace = "me.gomer.hilttest"

    defaultConfig {
        applicationId = "me.gomer.hilttest"
        versionCode = 1
        versionName = "1.0"

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
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.terrakok.cicerone)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.androidx.fragment.ktx)
    implementation(project(":features:feature2:feature2api"))

    implementation(project(":features:feature2:feature2impl"))
    implementation(project(":features:feature1:feature1impl"))
    implementation(project(":features:feature1:feature1api"))
}