package com.sergiobelda.gramophone.androidApp.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.sergiobelda.gramophone.androidApp.viewmodel.MainViewModel

@Composable
fun ArtistsScreen(mainViewModel: MainViewModel) {
    LazyColumn {
        items(mainViewModel.getArtists()) {
            Text(it.name)
        }
    }
}