package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniAction()

    }
    fun iniAction(){
       btn_login.setOnClickListener {
           login()
       }

    }

    fun login(){
        val request = UserRequest()
        request.email = editTextTextEmailAddress.text.toString().trim()
        request.password = editTextTextPassword.text.toString().trim()

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        retro.login(request).enqueue(object : Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                val user = response.body()

                user!!.data?.password?.let { Log.e("Token", it) }
                user!!.data?.email?.let { Log.e("Email", it) }
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                t.message?.let { Log.e("Error", it) }
            }

        })

    }

}