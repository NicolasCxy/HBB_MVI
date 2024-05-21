pluginManagement {
    repositories {
        google()
        jcenter()
        maven {
            url = uri("https://jitpack.io")
        }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/jcenter") }
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
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/jcenter") }
        mavenCentral()

    }
}

rootProject.name = "MVI_HBB"
include(":app")
 