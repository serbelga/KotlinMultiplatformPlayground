package com.sergiobelda.gramophone.androidApp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.sergiobelda.gramophone.androidApp.viewmodel.MainViewModel
import com.sergiobelda.gramophone.shared.model.Album
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun AlbumsScreen(mainViewModel: MainViewModel) {
    val albums = mainViewModel.getAlbums()
    LazyColumn {
        items(albums) {
            AlbumCardItem(album = it)
        }
    }


}

@Composable
fun AlbumCardItem(album: Album) {
    Card {
        Column {
            GlideImage(data = album.cover, modifier = Modifier.size(120.dp)) {

            }
            Text(text = album.title)
        }
    }
}
