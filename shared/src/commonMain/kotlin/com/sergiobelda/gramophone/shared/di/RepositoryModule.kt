package com.sergiobelda.gramophone.shared.di

import com.sergiobelda.gramophone.shared.repository.AlbumRepository
import com.sergiobelda.gramophone.shared.repository.ArtistRepository
import com.sergiobelda.gramophone.shared.repository.SongsRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        ArtistRepository(get())
    }
    single {
        SongsRepository(get())
    }
    single {
        AlbumRepository(get())
    }
}
