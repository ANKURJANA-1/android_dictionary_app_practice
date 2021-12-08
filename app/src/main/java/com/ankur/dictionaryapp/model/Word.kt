package com.ankur.dictionaryapp.model

data class Word(
    var word: String = "",
    var phonetic: String = "",
    var phonetics: ArrayList<Phonetic> = ArrayList(),
    var origin: String = "",
    val meanings: ArrayList<Meaning> = ArrayList(),
)
