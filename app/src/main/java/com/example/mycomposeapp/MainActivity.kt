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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposeapp.ui.theme.MyComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
                ListItem(name = "Ivan", prof = "Mobile Developer")
            }
        }
    }
}
@Composable
private fun ListItem(name: String, prof: String) {
    var counter = remember {
        mutableStateOf(0)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                counter.value++
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
        ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(  painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .size(64.dp)
                            .clip(CircleShape)
                            .background(Color.Red)
                )

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = counter.value.toString())
                    Text(text = prof)
                }
            }
        }
    }
}

