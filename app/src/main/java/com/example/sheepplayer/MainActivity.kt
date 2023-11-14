package com.example.sheepplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sheepplayer.ui.theme.SheepPlayerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SheepPlayerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var tel = mutableStateOf(0)
    Row(modifier = Modifier.padding(all = 8.dp)) {

            Image(
                painter = painterResource(R.drawable.cosmic_sheep),
                contentDescription ="mijn schaap",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(40.dp)
                    // Clip image to be shaped as a circle
                    .clip(CircleShape)
            )
        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))
        Column {

            Text(
                text = "Hello $name!",
                modifier = modifier
            )
            // Add a vertical space between the author and message texts
            //Spacer(modifier = Modifier.height(4.dp))
            Text("knop " + tel.value +"X ingedrukt")
        }
        Button(onClick = {tel.value++}) {
            Text("de knope")
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SheepPlayerTheme {
        Greeting("Android")
    }
}