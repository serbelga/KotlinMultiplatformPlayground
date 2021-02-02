package com.sergiobelda.gramophone.androidApp.ui

import androidx.compose.runtime.Composable
import com.sergiobelda.gramophone.androidApp.viewmodel.MainViewModel

@Composable
fun GramophoneApp(mainViewModel: MainViewModel) {
    LibraryScreen(mainViewModel)
}
