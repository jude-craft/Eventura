package com.example.eventura.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.eventura.ui.theme.Black
import com.example.eventura.ui.theme.focusedTextFieldColor
import com.example.eventura.ui.theme.textFieldContainer
import com.example.eventura.ui.theme.unFocusedTextFieldText

@Composable
fun LoginTextField(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String,
) {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black

    TextField(
        value = "",
        onValueChange = {},
        modifier = modifier,
        label = {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
                color = uiColor
            )
        },
        colors = TextFieldDefaults.colors(
            focusedPlaceholderColor = MaterialTheme.colorScheme.focusedTextFieldColor,
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.unFocusedTextFieldText,
            unfocusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
            focusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
        ),
        trailingIcon = {
            TextButton(onClick = {}) {
                Text(
                    text = trailing,
                    style = MaterialTheme.typography.labelMedium,
                    color = uiColor
                )
            }
        }
    )

}