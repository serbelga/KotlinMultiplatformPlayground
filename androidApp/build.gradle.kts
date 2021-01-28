plugins {
    id("com.android.application")
    kotlin("android")
}
group = "com.sergiobelda.gramophone"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
dependencies {
    implementation(project(":shared"))
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.constraintLayout)
    implementation(Dependencies.Google.materialComponentsAndroid)
    implementation(Dependencies.Koin.android)
    implementation(Dependencies.Koin.androidScope)
    implementation(Dependencies.Koin.androidViewModel)
}
android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.sergiobelda.gramophone.androidApp"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}