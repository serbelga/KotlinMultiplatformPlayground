package com.sergiobelda.gramophone.shared.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
    appDeclaration()
    modules(databaseModule)
    modules(repositoryModule)
    modules(useCaseModule)
}

fun initKoin() = initKoin {}