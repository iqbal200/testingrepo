package com.example.login

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST ("Login")

    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}