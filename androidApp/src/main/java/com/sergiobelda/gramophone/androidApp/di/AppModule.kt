package com.sergiobelda.gramophone.androidApp.di

import com.sergiobelda.gramophone.androidApp.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MainViewModel(get(), get(), get()) }
}