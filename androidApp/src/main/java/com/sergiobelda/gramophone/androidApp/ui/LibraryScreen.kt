package com.sergiobelda.gramophone.androidApp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.*
import com.sergiobelda.gramophone.androidApp.viewmodel.MainViewModel

@Composable
fun LibraryScreen(mainViewModel: MainViewModel) {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("Artists", "Albums", "Playlists")
    Column {
        TabRow(selectedTabIndex = state) {
            titles.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    onClick = { state = index },
                    selected = (index == state)
                )
            }
        }
        ArtistsScreen(mainViewModel)
    }
}