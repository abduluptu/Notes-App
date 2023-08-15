package com.abdul.notesapp.models

//Step6.2: Create a model class for User SignIn Response
data class User(
    val createdAt: String,
    val email: String,
    val id: String,
    val updatedAt: String,
    val username: String
)
