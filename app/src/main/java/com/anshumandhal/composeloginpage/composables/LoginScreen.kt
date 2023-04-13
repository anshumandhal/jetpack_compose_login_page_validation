package com.anshumandhal.composeloginpage.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.anshumandhal.composeloginpage.*

@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {

    val emailState = remember { EmailState() }
    val passwordState = remember { PasswordState() }

    Column(modifier = Modifier.fillMaxWidth()) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            TitleText()
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            EmailTextField(
                emailState.text,
                emailState.error
            ) {
                emailState.text = it
                emailState.validate()
            }
            PasswordTextField(
                passwordState.text,
                passwordState.error
            ) {
                passwordState.text = it
                passwordState.validate()
            }
            LoginButton(
                enabled = emailState.isValid() &&
                        passwordState.isValid() &&
                        emailState.text.isNotEmpty() &&
                        passwordState.text.isNotEmpty()
            )
        }
    }
}

@Composable
fun TitleText() {
    Text(text = "Hello,", style = MaterialTheme.typography.h3, color = Color.Blue)
    Text(text = "Login here", style = MaterialTheme.typography.h4, color = Color.Blue)
}