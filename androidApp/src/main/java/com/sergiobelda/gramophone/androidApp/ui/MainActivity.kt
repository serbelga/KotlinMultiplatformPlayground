package com.sergiobelda.gramophone.androidApp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.*
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import com.sergiobelda.gramophone.androidApp.ui.theme.GramophoneTheme
import com.sergiobelda.gramophone.androidApp.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GramophoneTheme {
                GramophoneApp(mainViewModel)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GramophoneTheme {
    }
}
