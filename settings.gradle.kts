pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://blockmanlauncher.vercel.app/archive/maven")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://blockmanlauncher.vercel.app/archive/maven")
    }
}
rootProject.name = "template Project"
include(":template")