package com.ankur.dictionaryapp.model

data class Meaning(
    var partOfSpeech:String="",
    var definitions:ArrayList<Defination> = ArrayList(),
)
