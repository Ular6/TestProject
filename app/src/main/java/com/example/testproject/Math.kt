package com.example.testproject

import androidx.core.util.PatternsCompat

class Math {

    fun plusDouble(c: Double, d: Double): Double {
        return c + d
    }

    fun plus(a: String, b: String): String {
        var result = ""
        if (a.isEmpty() || b.isEmpty()) {
            result = "Одно из полей является пустым"
        } else if (a.toIntOrString()) {
            val numberA = a.toInt()
            val numberB = b.toInt()
            result = (numberA + numberB).toString()
        } else {
            result = "Нельзя сложить буквы"
        }
        return result
    }

    fun checkEmail(email: String) : Boolean {
        return PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun numberCheck(number: String) : Boolean {
        return number.length == 9
    }

    private fun String.toIntOrString() : Boolean {
        return when(this.toIntOrNull()) {
            null -> false
            else -> true
        }
    }
}