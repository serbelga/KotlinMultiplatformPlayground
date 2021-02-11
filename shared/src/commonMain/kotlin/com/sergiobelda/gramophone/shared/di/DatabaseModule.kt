package com.sergiobelda.gramophone.shared.di

import com.sergiobelda.gramophone.shared.dao.*
import com.sergiobelda.gramophone.shared.db.DriverFactory
import com.sergiobelda.gramophone.shared.db.createDatabase
import org.koin.dsl.module

val databaseModule = module {
    single {
        createDatabase(DriverFactory())
    }
    single<ISongsDao> {
        SongsDao()
    }
    single<IArtistDao> {
        ArtistDao()
    }
    single<IAlbumDao> {
        AlbumDao()
    }
}
