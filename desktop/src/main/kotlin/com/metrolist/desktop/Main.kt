package com.metrolist.desktop

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.metrolist.music.ui.component.WavySlider
import com.metrolist.shared.sharedGreeting

fun main() =
    application {
        Window(onCloseRequest = ::exitApplication, title = "Metrolist") {
            MaterialTheme {
                Column(Modifier.padding(24.dp)) {
                    Text(sharedGreeting())
                    var value by remember { mutableStateOf(0.3f) }
                    WavySlider(value = value, onValueChange = { value = it })
                }
            }
        }
    }
