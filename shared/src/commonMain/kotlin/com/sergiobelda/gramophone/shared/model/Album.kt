package com.sergiobelda.gramophone.shared.model

import com.sergiobelda.gramophone.DbAlbum

data class Album(
    val id: Long,
    val title: String,
    val releaseYear: Long,
    val cover: String,
    val artistId: Long
)

fun DbAlbum.toDomain() = Album(id, title, release_year, cover, artist_id)
