package com.example.PetShop

abstract class Mood(val date: String) {
    abstract fun describe(): String
}