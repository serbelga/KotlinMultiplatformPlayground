plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android")
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
    implementation(Dependencies.AndroidX.Compose.material)
    implementation(Dependencies.AndroidX.Compose.ui)
    implementation(Dependencies.AndroidX.Compose.uiTooling)
    implementation(Dependencies.Google.materialComponentsAndroid)
    implementation(Dependencies.Koin.android)
    implementation(Dependencies.Koin.androidScope)
    implementation(Dependencies.Koin.androidViewModel)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-rc01")
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
        kotlinCompilerVersion = Versions.kotlin
    }
}