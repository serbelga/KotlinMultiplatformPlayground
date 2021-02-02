package com.sergiobelda.gramophone.shared.usecase

import com.sergiobelda.gramophone.shared.model.Song
import com.sergiobelda.gramophone.shared.repository.SongsRepository

class GetSongsUseCase(private val songRepository: SongsRepository) {

    operator fun invoke(): List<Song> = songRepository.getSongs()
}