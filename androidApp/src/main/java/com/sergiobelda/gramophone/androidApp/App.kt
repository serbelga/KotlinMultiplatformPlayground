package com.sergiobelda.gramophone.androidApp

import android.app.Application
import com.sergiobelda.gramophone.androidApp.di.appModule
import com.sergiobelda.gramophone.shared.db.appContext
import com.sergiobelda.gramophone.shared.di.initKoin
import org.koin.android.ext.koin.androidContext

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appContext = this

        initKoin {
            modules(appModule)
            androidContext(this@App)
        }
    }
}