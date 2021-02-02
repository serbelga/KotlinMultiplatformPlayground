package com.sergiobelda.gramophone.shared.di

import com.sergiobelda.gramophone.shared.usecase.GetArtistsUseCase
import com.sergiobelda.gramophone.shared.usecase.GetSongsUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { GetArtistsUseCase(get()) }
    single { GetSongsUseCase(get()) }
}