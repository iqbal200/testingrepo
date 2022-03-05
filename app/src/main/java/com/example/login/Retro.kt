package com.example.login

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro {

    fun getRetroClientInstance(): Retrofit{
        val gson = GsonBuilder().setLenient().create()

        return Retrofit.Builder()
            .baseUrl("https://62203ad3ce99a7de19536624.mockapi.io/api/register")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}