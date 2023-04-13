package com.anshumandhal.composeloginpage.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

@Composable
fun ErrorText(error: String) {
    Text(
        text = error,
        modifier = Modifier
            .fillMaxWidth(),
        style = TextStyle(color = MaterialTheme.colors.error)
    )
}
