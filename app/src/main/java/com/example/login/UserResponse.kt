package com.example.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("data")
    @Expose
    val data: User? = null

    class User {
        @SerializedName("email")
        @Expose
        val email: String? = null

        @SerializedName("name")
        @Expose
        val name: String? = null

        @SerializedName("token")
        @Expose
        val password: String? = null
    }
}