package com.example.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserRequest {
    @SerializedName("email")
    @Expose
    val email: String? = null

    @SerializedName("password")
    @Expose
    val password: String? = null
}