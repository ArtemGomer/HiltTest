//https://dev.to/aldok/how-to-access-projects-in-multimodule-gradle-project-4500
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "HiltTest"
include(":app")
include(":features:feature1:feature1impl")
include(":features:feature2:feature2impl")
include(":features:feature1:feature1api")
include(":features:feature2:feature2api")
