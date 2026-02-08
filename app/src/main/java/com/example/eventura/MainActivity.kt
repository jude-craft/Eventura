package com.example.eventura

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.eventura.ui.navigation.AppNavGraph
import com.example.eventura.ui.screens.WelcomeScreen
import com.example.eventura.ui.theme.EventuraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EventuraTheme {
                val navController = rememberNavController()
                AppNavGraph(navController = navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UiPreview() {
    EventuraTheme {
        WelcomeScreen()
    }
}

