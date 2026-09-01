package com.example.lab1

class Happy (date: String): Mood(date) {
    override fun describe(): String {
        return "happy!"
    }
}