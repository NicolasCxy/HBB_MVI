pluginManagement {
    repositories {
        google()
        jcenter()
        maven {
            url = uri("https://jitpack.io")
        }
        mavenCentral()
        gradlePluginPortal()

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        jcenter()
        maven {
            url = uri("https://jitpack.io")
        }
        mavenCentral()

    }
}

rootProject.name = "MVI_HBB"
include(":app")
 