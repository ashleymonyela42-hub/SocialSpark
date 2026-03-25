package com.example.socialspark

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.socialspark.ui.theme.SocialSparkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SocialSparkTheme {
                Column() {
                    var timeOfday = arrayOf(
                        "Morning",
                        "Mid-morning",
                        "Afternoon",
                        "Afternoon Snack Time",
                        "Evening",
                        "Night"
                    )
                    var suggestion = arrayOf(
                        "Send a good morning text to a family member",
                        "Reach out to a colleague with a quick thank you",
                        "Share a funny meme or interesting link with a friend",
                        "send a quick thinking about you message",
                        "Call a friend or relative for a 5 minute call",
                        "leave a thoughtful comment on a friend's post"
                    )
                    var text by remember { mutableStateOf ("")
                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        label = {Text("Enter time of the day")}
                    )
                }
            }
        }
    }
}

