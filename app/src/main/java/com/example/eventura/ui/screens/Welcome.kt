package com.example.eventura.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eventura.R
import com.example.eventura.ui.theme.Black
import com.example.eventura.ui.theme.EventuraTheme

@Composable
fun WelcomeScreen() {
    val textColor = if (isSystemInDarkTheme()) Color.White else Black
    val logoColor = if (isSystemInDarkTheme()) Color.White else Color.Black

    Surface(modifier = Modifier.fillMaxSize()) {
        // Use a Box to layer the background and foreground content
        Box(modifier = Modifier.fillMaxSize()) {

            // 1. Background Image (The "shape" or "hill")
            Image(
                painter = painterResource(id = R.drawable.shape),
                contentDescription = "Background Shape",
                contentScale = ContentScale.FillWidth, // Fills width, keeps aspect ratio
                modifier = Modifier.fillMaxWidth()
            )

            // 2. Main Content Column
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
                    // Make it scrollable for smaller screens
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Top Logo
                Icon(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "App Logo",
                    tint = logoColor,
                    modifier = Modifier.padding(top = 60.dp)
                )

                // Vertically center the main welcome content
                // using Arrangement.Center would push the logo up, so we use spacers
                Spacer(modifier = Modifier.height(100.dp))

                // Welcome Image Icon
                Image(
                    painter = painterResource(id = R.drawable.welcome),
                    contentDescription = "Welcome Illustration",
                    modifier = Modifier.size(200.dp) // Give it a fixed size
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Welcome Title
                Text(
                    text = "Welcome to Eventura",
                    style = MaterialTheme.typography.displaySmall,
                    color = textColor,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Subtitle/Tagline
                Text(
                    text = "Your ultimate companion for discovering and booking event tickets effortlessly.",
                    style = MaterialTheme.typography.titleMedium,
                    color = textColor,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(75.dp))

                // "Get Started" Button
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp)
                        .padding(bottom = 5.dp), // Padding from the absolute bottom
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    )
                ) {
                    Text(
                        text = "Get Started",
                        fontSize = 22.sp,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true, name = "Light Mode")
@Composable
fun WelcomeScreenLightPreview() {
    EventuraTheme(darkTheme = false) {
        WelcomeScreen()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark Mode")
@Composable
fun WelcomeScreenDarkPreview() {
    EventuraTheme(darkTheme = true) {
        WelcomeScreen()
    }
}
