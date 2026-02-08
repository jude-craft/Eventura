package com.example.eventura.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Primary Colors
val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

// Custom Brand Colors
val Black = Color(0xFF000113)
val LightBlueWhite = Color(0xFFF1F5F9)
val BlueGray = Color(0xFF334155)

// Professional Accent Colors
val AccentBlue = Color(0xFF3B82F6)
val AccentBlueDark = Color(0xFF60A5FA)
val DarkSurface = Color(0xFF0F172A)
val LightSurface = Color(0xFFFFFFFF)

// Text Field Colors
val ColorScheme.focusedTextFieldColor
    @Composable
    get() = if (isSystemInDarkTheme()) Color.White else Black

val ColorScheme.unFocusedTextFieldText
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF94A3B8) else Color(0xFF475569)

val ColorScheme.textFieldContainer
    @Composable
    get() = if (isSystemInDarkTheme()) BlueGray.copy(alpha = 0.6f) else LightBlueWhite