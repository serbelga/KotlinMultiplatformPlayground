package com.sergiobelda.gramophone.shared.db

import com.sergiobelda.gramophone.GramophoneDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(GramophoneDatabase.Schema, "test.db")
    }
}