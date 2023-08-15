package com.abdul.notesapp.models

//Step14: Create a note response model

data class NoteResponse(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val description: String,
    val title: String,
    val updatedAt: String,
    val userId: String
)
