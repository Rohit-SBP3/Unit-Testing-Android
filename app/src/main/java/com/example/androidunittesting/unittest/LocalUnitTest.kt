package com.example.androidunittesting.unittest

class Password {

    fun validatePassword(password: String?): Boolean {
        return !password.isNullOrEmpty() && password.length >= 6 && password.length <= 15
    }

    fun reversePasswordString(password: String?): String {
        if(password.isNullOrEmpty()) return ""
        else{
            return password.reversed()
        }
    }

}