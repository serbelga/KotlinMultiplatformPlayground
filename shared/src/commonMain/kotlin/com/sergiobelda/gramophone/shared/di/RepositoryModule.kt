package com.sergiobelda.gramophone.shared.di

import com.sergiobelda.gramophone.shared.repository.SongsRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        SongsRepository(get())
    }
}