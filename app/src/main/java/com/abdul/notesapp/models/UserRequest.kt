package com.abdul.notesapp.models

//Step7: Create a model class for User SignIn Request
data class UserRequest(
    val email: String,
    val password: String,
    val username: String
)
