plugins {
    id("me.gomer.plugin.android.library")
}

android {
    namespace = "me.gomer.feature2impl"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    implementation(projects.features.feature2.feature2api)
    implementation(projects.navigation.api)
}