package com.example.androidunittesting.utils

class Password {

    fun validatePassword(password: String?): Boolean {
        return !password.isNullOrEmpty() && password.length >= 6 && password.length <= 15
    }

    fun reversePasswordString(password: String?): String {
        return if(password.isNullOrEmpty()) ""
        else{
            password.reversed()
        }
    }

}