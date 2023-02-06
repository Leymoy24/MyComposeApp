package com.example.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposeapp.ui.theme.MyComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth().fillMaxHeight(0.5f),) {


                Column(
                    modifier = Modifier.background(Color.Red).fillMaxWidth(0.5f).fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly, // расположение элементов
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Hello!")
                    Text(text = "Girona")
                    Text(text = "Madrid")
                }
                Column(
                    modifier = Modifier.background(Color.Yellow).fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly, // расположение элементов
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Hello!")
                    Text(text = "Girona")
                    Text(text = "Madrid")
                }
            }
        }
    }
}

