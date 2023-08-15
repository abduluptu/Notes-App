package com.abdul.notesapp.models

//Step6.1: Create a model class for User SignIn Response
data class UserResponse(
    val token: String,
    val user: User
)
