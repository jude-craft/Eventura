package com.example.eventura.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.example.eventura.ui.theme.Black
import com.example.eventura.ui.theme.focusedTextFieldColor
import com.example.eventura.ui.theme.textFieldContainer
import com.example.eventura.ui.theme.unFocusedTextFieldText

@Composable
fun LoginTextField(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String = "",
    value: String,
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false
) {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black
    var passwordVisible by remember { mutableStateOf(false) }

    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        label = {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
                color = uiColor
            )
        },
        visualTransformation = if (isPassword && !passwordVisible) 
            PasswordVisualTransformation() 
        else 
            VisualTransformation.None,
        colors = TextFieldDefaults.colors(
            focusedTextColor = uiColor,
            unfocusedTextColor = uiColor,
            focusedPlaceholderColor = MaterialTheme.colorScheme.focusedTextFieldColor,
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.unFocusedTextFieldText,
            unfocusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
            focusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
        ),
        trailingIcon = if (isPassword || trailing.isNotEmpty()) {
            {
                when {
                    isPassword -> {
                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(
                                imageVector = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                                contentDescription = if (passwordVisible) "Hide password" else "Show password",
                                tint = uiColor
                            )
                        }
                    }
                    trailing.isNotEmpty() -> {
                        TextButton(onClick = {}) {
                            Text(
                                text = trailing,
                                style = MaterialTheme.typography.labelMedium,
                                color = uiColor
                            )
                        }
                    }
                }
            }
        } else null
    )

}