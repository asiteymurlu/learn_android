package com.example.firstapp

object Comparator {


    fun compare(firstImage: Int, secondImage: Int): Winner {
        var result: Winner = Winner.DRAW
        if (firstImage == secondImage) {
            result = Winner.DRAW
        } else if (firstImage == R.drawable.tash && secondImage == R.drawable.kagit) {
            result = Winner.SECOND
        } else if (firstImage == R.drawable.tash && secondImage == R.drawable.makas) {
            result = Winner.FIRST
        } else if (firstImage == R.drawable.kagit && secondImage == R.drawable.tash) {
            result = Winner.FIRST
        } else if (firstImage == R.drawable.makas && secondImage == R.drawable.tash) {
            result = Winner.SECOND
        } else if (firstImage == R.drawable.kagit && secondImage == R.drawable.makas) {
            result = Winner.SECOND
        } else if (firstImage == R.drawable.makas && secondImage == R.drawable.kagit) {
            result = Winner.FIRST
        }
        return result
    }
}

enum class Winner {
    DRAW, FIRST, SECOND
}