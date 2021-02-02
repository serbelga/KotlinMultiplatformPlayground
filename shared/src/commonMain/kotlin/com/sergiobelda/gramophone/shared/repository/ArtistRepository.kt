package com.sergiobelda.gramophone.shared.repository

import com.sergiobelda.gramophone.shared.dao.IArtistDao
import com.sergiobelda.gramophone.shared.model.Artist
import com.sergiobelda.gramophone.shared.model.toDomain

class ArtistRepository(private val artistDao: IArtistDao) {

    fun getArtists(): List<Artist> =
        artistDao.getArtists().map { it.toDomain() }
}