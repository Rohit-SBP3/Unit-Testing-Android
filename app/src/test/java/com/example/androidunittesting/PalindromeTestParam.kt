package com.example.androidunittesting

import com.example.androidunittesting.utils.Palindrome
import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized


@RunWith(value = Parameterized::class)
class PalindromeTestParam(val input: String, val expectedValue: Boolean) {

    lateinit var palindrome: Palindrome

    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "{index} : {0} is palindrome - {1}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("goddog",true),
                arrayOf("",true),
                arrayOf("machine",false),
                arrayOf("bakery",false)
            )
        }

    }

    @Test
    fun isPalindromeParam() {

        palindrome = Palindrome()
        val result = palindrome.isPalindrome(input)
        assertEquals(expectedValue,result)
    }

}