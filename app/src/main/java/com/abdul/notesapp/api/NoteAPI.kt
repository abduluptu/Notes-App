package com.abdul.notesapp.api

import com.abdul.notesapp.models.NoteRequest
import com.abdul.notesapp.models.NoteResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

//Step16:  Create api interface for use note

interface NoteAPI {

    @POST("/note")
    suspend fun createNote(@Body noteRequest: NoteRequest): Response<NoteResponse>

    @GET("/note")
    suspend fun getNotes(): Response<List<NoteResponse>>

    @DELETE("/note/{noteId}")
    suspend fun deleteNote(@Path("noteId") noteId: String): Response<NoteResponse>

    @PUT("/note/{noteId}")
    suspend fun updateNote(
        @Path("noteId") noteId: String,
        @Body noteRequest: NoteRequest
    ): Response<NoteResponse>
}