package com.anshumandhal.composeloginpage.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun PasswordTextField(
    passwordText: String,
    errorText: String?,
    onPasswordChanged: (String) -> Unit
) {

    val passwordVisibility = remember {
        mutableStateOf(false)
    }
    Column() {
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = passwordText,
            onValueChange = { password -> onPasswordChanged(password) },
            label = {
                Text(text = "Password")
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(8.dp),
            visualTransformation = if (passwordVisibility.value) VisualTransformation.None
            else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            trailingIcon = {
                if (passwordVisibility.value) {
                    IconButton(onClick = { passwordVisibility.value = false }) {
                        Icon(
                            imageVector = Icons.Default.Visibility,
                            contentDescription = "Hide password"
                        )
                    }
                } else {
                    IconButton(onClick = { passwordVisibility.value = true }) {
                        Icon(
                            imageVector = Icons.Default.VisibilityOff,
                            contentDescription = "Show password"
                        )
                    }
                }
            },
            isError = errorText != null

        )
        errorText?.let { errorMessage ->
            ErrorText(error = errorMessage)
        }
    }
}