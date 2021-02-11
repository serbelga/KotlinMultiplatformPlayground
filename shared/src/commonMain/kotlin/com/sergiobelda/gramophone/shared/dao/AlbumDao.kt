package com.sergiobelda.gramophone.shared.dao

import com.sergiobelda.gramophone.DbAlbum
import com.sergiobelda.gramophone.GramophoneDatabase
import org.koin.core.KoinComponent
import org.koin.core.inject

class AlbumDao : IAlbumDao, KoinComponent {

    private val database: GramophoneDatabase by inject()

    override fun getAlbums(): List<DbAlbum> =
        database.musicQueries.selectAllAlbums().executeAsList()
}