package com.example.lab1

class Sad (date: String): Mood(date) {
    override fun describe(): String {
        return "sad :("
    }
}