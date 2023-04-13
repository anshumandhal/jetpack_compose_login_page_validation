package com.anshumandhal.composeloginpage.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginButton(enabled: Boolean) {
    Button(
        onClick = {
            /*TODO*/
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        contentPadding = PaddingValues(16.dp),
        shape = RoundedCornerShape(8.dp),
        enabled = enabled
    ) {
        Text(text = "Login")
    }
}