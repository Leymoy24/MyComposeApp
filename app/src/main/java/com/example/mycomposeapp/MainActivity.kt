package com.example.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposeapp.ui.theme.MyComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
                CircleItem()
            }
        }
    }
}
@Composable
private fun CircleItem() {
    var counter = remember {
        mutableStateOf(0)
    }
    var color = remember {
        mutableStateOf(Color.Blue)
    }

    Box(modifier = Modifier
        .size(100.dp)
        .background(color = color.value, shape = CircleShape).clickable {
            when(++counter.value) {
                10 -> color.value = Color.Red
                20 -> color.value = Color.Cyan
            }
        },
        contentAlignment = Alignment.Center) {
        Text(text = counter.value.toString(), style = TextStyle(Color.White, fontSize = 20.sp))
    }
}

