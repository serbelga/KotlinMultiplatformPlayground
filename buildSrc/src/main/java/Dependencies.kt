object Versions {
    const val appCompat = "1.2.0"
    const val constraintLayout = "2.0.4"
    const val koin = "3.0.0-alpha-4"
    const val sqlDelight = "1.4.4"
    const val materialComponentsAndroid = "1.2.1"
}

object Dependencies {

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Google {
        const val materialComponentsAndroid = "com.google.android.material:material:${Versions.materialComponentsAndroid}"
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
    }
}