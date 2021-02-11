package com.sergiobelda.gramophone.shared.usecase

import com.sergiobelda.gramophone.shared.model.Album
import com.sergiobelda.gramophone.shared.repository.AlbumRepository

class GetAlbumsUseCase(private val albumRepository: AlbumRepository) {

    operator fun invoke(): List<Album> = albumRepository.getAlbums()
}