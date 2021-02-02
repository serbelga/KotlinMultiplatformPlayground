package com.sergiobelda.gramophone.shared.db

import com.sergiobelda.gramophone.GramophoneDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver

actual class DriverFactory {
    actual fun createDriver(): SqlDriver {
        val driver: SqlDriver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
        GramophoneDatabase.Schema.create(driver)
        return driver
    }
}