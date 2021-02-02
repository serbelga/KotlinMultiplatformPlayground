package com.sergiobelda.gramophone.shared.dao

import com.sergiobelda.gramophone.DbSong
import com.sergiobelda.gramophone.GramophoneDatabase
import org.koin.core.KoinComponent
import org.koin.core.inject

class SongsDao : ISongsDao, KoinComponent {

    private val database: GramophoneDatabase by inject()

    override fun getSongs(): List<DbSong> =
        database.musicQueries.selectAllSongs().executeAsList()

    override fun getSongById(id: Long): DbSong =
        database.musicQueries.selectSongById(id).executeAsOne()
}
