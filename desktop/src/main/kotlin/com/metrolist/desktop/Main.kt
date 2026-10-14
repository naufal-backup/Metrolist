package com.metrolist.desktop

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.metrolist.shared.sharedGreeting

fun main() =
    application {
        Window(onCloseRequest = ::exitApplication, title = "Metrolist") {
            MaterialTheme {
                Text(sharedGreeting())
            }
        }
    }
