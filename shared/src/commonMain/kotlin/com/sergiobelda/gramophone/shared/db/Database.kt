package com.sergiobelda.gramophone.shared.db

import com.sergiobelda.gramophone.GramophoneDatabase

fun createDatabase(driverFactory: DriverFactory): GramophoneDatabase {
    return GramophoneDatabase(driverFactory.createDriver())
}