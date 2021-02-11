buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Kotlin.kotlinGradlePlugin)
        classpath("com.android.tools.build:gradle:7.0.0-alpha05")
        classpath(Dependencies.SqlDelight.gradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21-2")
    }
}

group = "com.sergiobelda.gramophone"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://dl.bintray.com/ekito/koin")
        maven(url = "https://jitpack.io")
    }
}
