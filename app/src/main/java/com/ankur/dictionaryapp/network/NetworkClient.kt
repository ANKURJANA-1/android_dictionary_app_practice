package com.ankur.dictionaryapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkClient {

    var retrofitService: RetrofitService? = null

    fun getInstance(): RetrofitService {

        if (retrofitService == null) {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.dictionaryapi.dev")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofitService = retrofit.create(RetrofitService::class.java)
        }
        return retrofitService!!
    }
}