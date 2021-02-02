object Versions {
    const val appCompat = "1.2.0"
    const val compose = "1.0.0-alpha10"
    const val constraintLayout = "2.0.4"
    const val koin = "3.0.0-alpha-4"
    const val kotlin = "1.4.21"
    const val sqlDelight = "1.4.4"
    const val materialComponentsAndroid = "1.2.1"
}

object Dependencies {

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        object Compose {
            const val ui = "androidx.compose.ui:ui:${Versions.compose}"
            const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
            const val material = "androidx.compose.material:material:${Versions.compose}"
        }
    }

    object Google {
        const val materialComponentsAndroid = "com.google.android.material:material:${Versions.materialComponentsAndroid}"
    }

    object Kotlin {
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    object Koin {
        const val android = "org.koin:koin-android:${Versions.koin}"
        const val androidScope = "org.koin:koin-androidx-scope:${Versions.koin}"
        const val androidViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
        const val core = "org.koin:koin-core:${Versions.koin}"
    }

    object SqlDelight {
        const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
        const val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
        const val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        const val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
        const val sqliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
    }
}