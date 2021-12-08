package com.ankur.dictionaryapp.repository

import android.content.Context
import android.util.Log
import com.ankur.dictionaryapp.model.Parent
import com.ankur.dictionaryapp.model.Word
import com.ankur.dictionaryapp.network.NetworkClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

object Repository {
    fun getWords(word: String): ArrayList<Word>? {
        var parent: ArrayList<Word>? = null
        try {
            NetworkClient
                .getInstance()
                .getWords(word)
                .enqueue(object : Callback<ArrayList<Word>> {
                    override fun onResponse(
                        call: Call<ArrayList<Word>>,
                        response: Response<ArrayList<Word>>
                    ) {
                        if (response.isSuccessful) {
                            parent = response.body() as ArrayList<Word>
                        }
                    }

                    override fun onFailure(call: Call<ArrayList<Word>>, t: Throwable) {
                        Log.d("data", t.toString())
                    }

                })
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return parent
    }
}