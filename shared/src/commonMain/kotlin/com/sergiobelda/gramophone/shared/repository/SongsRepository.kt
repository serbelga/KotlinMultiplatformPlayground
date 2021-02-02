package com.sergiobelda.gramophone.shared.repository

import com.sergiobelda.gramophone.shared.dao.ISongsDao
import com.sergiobelda.gramophone.shared.model.Song
import com.sergiobelda.gramophone.shared.model.toDomain

class SongsRepository(private val songsDao: ISongsDao) {

    fun getSongs(): List<Song> {
        return songsDao.getSongs().map { it.toDomain() }
    }
}