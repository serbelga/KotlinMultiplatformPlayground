package com.sergiobelda.gramophone.shared.dao

import com.sergiobelda.gramophone.DbArtist

interface IArtistDao {

    fun getArtists(): List<DbArtist>

    fun getArtistById(id: Long): DbArtist
}