package com.sergiobelda.gramophone.shared.db

import android.content.Context
import com.sergiobelda.gramophone.GramophoneDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

lateinit var appContext: Context

actual class DriverFactory {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(GramophoneDatabase.Schema, appContext, "test.db")
    }
}