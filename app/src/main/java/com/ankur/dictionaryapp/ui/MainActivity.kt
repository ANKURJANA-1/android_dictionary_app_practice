package com.ankur.dictionaryapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ankur.dictionaryapp.R
import com.ankur.dictionaryapp.repository.Repository

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("response", Repository.getWords("android").toString())
    }
}