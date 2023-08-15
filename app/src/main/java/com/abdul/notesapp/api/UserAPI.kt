package com.abdul.notesapp.api

import com.abdul.notesapp.models.UserRequest
import com.abdul.notesapp.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

//Step8: Create api interface for use  signin & signup

interface UserAPI {

    @POST("/users/signup")
    suspend fun signup(@Body userRequest: UserRequest) : Response<UserResponse>

    @POST("/users/signin")
    suspend fun signin(@Body userRequest: UserRequest) : Response<UserResponse>
}