package com.example.firstapp

import java.util.Random

object Generator {

    fun generateRandomNumber(): Int = Random().nextInt(3)

    fun getImage(): Int {

    val images = listOf<Int>(R.drawable.tash, R.drawable.kagit, R.drawable.makas)
        val index = generateRandomNumber()
        return images[index]
    }
}