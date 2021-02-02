package com.sergiobelda.gramophone.shared.dao

import com.sergiobelda.gramophone.DbArtist
import com.sergiobelda.gramophone.GramophoneDatabase
import org.koin.core.KoinComponent
import org.koin.core.inject

class ArtistDao : IArtistDao, KoinComponent {

    private val database: GramophoneDatabase by inject()

    override fun getArtists(): List<DbArtist> =
        database.musicQueries.selectAllArtists().executeAsList()

    override fun getArtistById(id: Long): DbArtist =
        database.musicQueries.selectArtistById(id).executeAsOne()
}