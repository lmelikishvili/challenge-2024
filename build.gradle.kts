// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    // For Dagerhilt
    id("com.google.dagger.hilt.android") version "2.47" apply false
    id("androidx.navigation.safeargs") version "2.5.0" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.6")
        classpath("com.android.tools.build:gradle:4.1.2")
    }
}