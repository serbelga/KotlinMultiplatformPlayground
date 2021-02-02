package com.sergiobelda.gramophone.shared.model

import com.sergiobelda.gramophone.DbSong

data class Song(
    val id: Long,
    val title: String
)

fun DbSong.toDomain(): Song = Song(id, title)
