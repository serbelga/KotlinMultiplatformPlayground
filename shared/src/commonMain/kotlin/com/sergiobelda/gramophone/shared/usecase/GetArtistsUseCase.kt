package com.sergiobelda.gramophone.shared.usecase

import com.sergiobelda.gramophone.shared.model.Artist
import com.sergiobelda.gramophone.shared.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {

    operator fun invoke(): List<Artist> = artistRepository.getArtists()
}