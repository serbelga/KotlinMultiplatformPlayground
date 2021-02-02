package com.sergiobelda.gramophone.shared.model

import com.sergiobelda.gramophone.DbArtist

data class Artist(
    val id: Long,
    val name: String
)

fun DbArtist.toDomain() = Artist(id, name)