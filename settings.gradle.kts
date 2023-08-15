pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        //Step: for loader
        // add like this
        maven { url = uri("https://jitpack.io") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //Step: for loader
        // add like this
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "Notes App"
include(":app")
 