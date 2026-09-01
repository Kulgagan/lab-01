package com.example.PetShop

class Sad (date: String): Mood(date) {
    override fun describe(): String {
        return "sad :("
    }
}