package com.anshumandhal.composeloginpage

class PasswordState : TextFieldState(
    validator = { password ->
        password.length >= 6
    },
    errorMessage = { "Password is invalid. Must be at least 6 characters" }
)