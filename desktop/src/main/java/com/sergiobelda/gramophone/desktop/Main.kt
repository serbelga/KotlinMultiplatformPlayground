package com.sergiobelda.gramophone.desktop

import androidx.compose.desktop.Window
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar

fun main() = Window {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "Gramophone")
            })
        }
    ) {

    }
    Button(onClick = {}) {
        Text(text = "Button")
    }
}