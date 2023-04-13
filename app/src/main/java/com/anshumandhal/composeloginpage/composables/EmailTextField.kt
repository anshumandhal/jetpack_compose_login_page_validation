package com.anshumandhal.composeloginpage.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun EmailTextField(
    emailText: String,
    errorText: String?,
    onEmailChanged: (String) -> Unit
) {

    Column() {
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = emailText,
            onValueChange = { email -> onEmailChanged(email) },
            label = {
                Text(text = "Email address")
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            isError = errorText != null
        )

        errorText?.let { errorMessage ->
            ErrorText(error = errorMessage)
        }
    }
}