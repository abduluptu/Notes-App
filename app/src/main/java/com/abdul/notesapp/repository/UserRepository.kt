package com.abdul.notesapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.abdul.notesapp.api.UserAPI
import com.abdul.notesapp.models.UserRequest
import com.abdul.notesapp.models.UserResponse
import com.abdul.notesapp.utils.NetworkResult
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject

//Step11: Create an user repository to get data from network

class UserRepository @Inject constructor(private val userAPI: UserAPI){


     private val _userResponseLiveData = MutableLiveData<NetworkResult<UserResponse>>()
      val userResponseLiveData: LiveData<NetworkResult<UserResponse>>
         get() = _userResponseLiveData

    suspend fun registerUser(userRequest: UserRequest) {
        _userResponseLiveData.postValue(NetworkResult.Loading())
        val response = userAPI.signup(userRequest)
        handleResponse(response)
    }

    suspend fun loginUser(userRequest: UserRequest) {
        _userResponseLiveData.postValue(NetworkResult.Loading())
        val response =userAPI.signin(userRequest)
        handleResponse(response)
    }


    private fun handleResponse(response: Response<UserResponse>) {
        if (response.isSuccessful && response.body() != null) {
            _userResponseLiveData.postValue(NetworkResult.Success(response.body()!!))
        }
        else if(response.errorBody()!=null){
            val errorObj = JSONObject(response.errorBody()!!.charStream().readText())
            _userResponseLiveData.postValue(NetworkResult.Error(errorObj.getString("message")))
        }
        else{
            _userResponseLiveData.postValue(NetworkResult.Error("Something Went Wrong"))
        }
    }

}