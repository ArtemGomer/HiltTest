plugins {
    id("me.gomer.plugin.android.library")
    id("me.gomer.plugin.hilt")
}

android {
    namespace = "me.gomer.feature2impl"
}

dependencies {

    implementation(libs.terrakok.cicerone)

    implementation(projects.features.feature2.feature2api)
    implementation(projects.features.feature1.feature1api)
    implementation(projects.features.feature2.feature2impl)
    implementation(projects.features.feature1.feature1impl)
    implementation(projects.navigation.api)
}