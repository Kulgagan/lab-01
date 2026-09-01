package com.example.PetShop

abstract class Pet (val name: String, var age: Int) {
    abstract fun speak(): String
}
