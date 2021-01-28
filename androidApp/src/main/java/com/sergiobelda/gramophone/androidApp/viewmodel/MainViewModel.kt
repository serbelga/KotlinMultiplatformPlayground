package com.sergiobelda.gramophone.androidApp.viewmodel

import androidx.lifecycle.ViewModel
import com.sergiobelda.gramophone.shared.model.Song
import com.sergiobelda.gramophone.shared.usecase.GetSongsUseCase

class MainViewModel(private val getSongsUseCase: GetSongsUseCase) : ViewModel() {

    fun getSongs(): List<String> = getSongsUseCase()
}