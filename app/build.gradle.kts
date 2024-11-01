plugins {
    id("me.gomer.plugin.android.application")
    id("me.gomer.plugin.hilt")
}

android {
    namespace = "me.gomer.hilttest"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.androidx.fragment.ktx)

    implementation(projects.navigation.api)
    implementation(projects.navigation.impl)
}