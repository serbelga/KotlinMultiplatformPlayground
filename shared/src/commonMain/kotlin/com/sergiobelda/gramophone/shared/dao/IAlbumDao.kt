package com.sergiobelda.gramophone.shared.dao

import com.sergiobelda.gramophone.DbAlbum

interface IAlbumDao {

    fun getAlbums(): List<DbAlbum>
}