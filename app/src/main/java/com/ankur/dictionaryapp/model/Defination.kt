package com.ankur.dictionaryapp.model

data class Defination(
    var definition: String = "",
    var example: String = "",
    var synonyms: ArrayList<String> = ArrayList(),
    var antonyms: ArrayList<String> = ArrayList()
)
