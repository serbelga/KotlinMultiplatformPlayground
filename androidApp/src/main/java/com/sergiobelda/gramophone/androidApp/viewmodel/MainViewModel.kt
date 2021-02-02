package com.sergiobelda.gramophone.androidApp.viewmodel

import androidx.lifecycle.ViewModel
import com.sergiobelda.gramophone.shared.model.Artist
import com.sergiobelda.gramophone.shared.model.Song
import com.sergiobelda.gramophone.shared.usecase.GetArtistsUseCase
import com.sergiobelda.gramophone.shared.usecase.GetSongsUseCase

class MainViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val getSongsUseCase: GetSongsUseCase
) : ViewModel() {

    fun getArtists(): List<Artist> = getArtistsUseCase()

    fun getSongs(): List<Song> = getSongsUseCase()
}