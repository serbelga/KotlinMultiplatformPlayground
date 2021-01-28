package com.sergiobelda.gramophone.shared.repository

import com.sergiobelda.gramophone.shared.dao.ISongsDao

class SongsRepository(private val songsDao: ISongsDao) {

    fun getSongs(): List<String> {
        return songsDao.getSongs()
    }
}