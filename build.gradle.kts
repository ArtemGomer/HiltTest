// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false
}

//https://github.com/gradle/gradle/issues/28407
//https://stackoverflow.com/questions/77279080/unable-to-make-progress-running-work-android-studio
gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))