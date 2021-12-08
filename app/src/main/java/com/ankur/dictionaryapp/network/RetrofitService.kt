package com.ankur.dictionaryapp.network

import com.ankur.dictionaryapp.model.Parent
import com.ankur.dictionaryapp.model.Word
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("/api/v2/entries/en/{word}")
    fun getWords(
        @Path(
            "word"
        ) word: String
    ): Call<ArrayList<Word>>
}