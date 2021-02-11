package com.sergiobelda.gramophone.shared.repository

import com.sergiobelda.gramophone.shared.dao.IAlbumDao
import com.sergiobelda.gramophone.shared.model.Album
import com.sergiobelda.gramophone.shared.model.toDomain

class AlbumRepository(private val albumDao: IAlbumDao) {

    fun getAlbums(): List<Album> =
        albumDao.getAlbums().map { it.toDomain() }
}