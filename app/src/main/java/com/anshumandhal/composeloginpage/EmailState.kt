package com.anshumandhal.composeloginpage

import android.util.Patterns

class EmailState : TextFieldState(
    validator = { email ->
        Patterns.EMAIL_ADDRESS.matcher(email).matches()
    },
    errorMessage = { email ->
        "$email is not a valid email"
    }
)