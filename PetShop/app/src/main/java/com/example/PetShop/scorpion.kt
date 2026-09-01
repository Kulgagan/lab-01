package com.example.PetShop

class Scorpion (name: String, age: Int): Pet(name, age) {
    override fun speak(): String {
        return "hiss"
    }
}