// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://blockmanlauncher.vercel.app/archive/maven")
    }
    dependencies {
        classpath(libs.kotlin.gradle.plugin)
    }
}
plugins {
    kotlin("jvm") version "2.1.10" apply false
}