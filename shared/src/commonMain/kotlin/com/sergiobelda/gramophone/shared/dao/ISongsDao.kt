package com.sergiobelda.gramophone.shared.dao

import com.sergiobelda.gramophone.DbSong

interface ISongsDao {

    fun getSongs(): List<DbSong>

    fun getSongById(id: Long): DbSong
}
