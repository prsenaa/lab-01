package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun mood(): String {
        return "The pet is happy"
    }
}