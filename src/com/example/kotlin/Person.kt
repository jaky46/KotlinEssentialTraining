package com.example.kotlin //copy this into the other classes (Person and clothing)

data class Person(private val firstname:String, private val lastname:String){
    val fullname:String
    get() = "$firstname $lastname"
}


