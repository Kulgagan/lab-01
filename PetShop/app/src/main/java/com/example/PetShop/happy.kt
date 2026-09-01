package com.example.PetShop

class Happy (date: String): Mood(date) {
    override fun describe(): String {
        return "happy!"
    }
}