buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Kotlin.kotlinGradlePlugin)
        classpath("com.android.tools.build:gradle:7.0.0-alpha04")
        classpath(Dependencies.SqlDelight.gradlePlugin)
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
    }
}
