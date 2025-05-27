package com.example.androidunittesting

import com.example.androidunittesting.utils.Palindrome
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


class PalindromeTest {

    lateinit var palindrome: Palindrome

    @Before
    fun setUp() {
        palindrome = Palindrome()
        println("Before Every Testcase!!")
    }

    @After
    fun tearDown() {
        println("After Every Testcase!!")
    }

    @Test
    fun isPalindrome_inputString_doggod_expectedTrue() {

        // Arrange
        // val palindrome = Palindrome()

        // Act
        val result = palindrome.isPalindrome("doggod")

        // Assert
        assertEquals(true,result)
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {

        // Arrange
        //val palindrome = Palindrome()

        // Act
        val result = palindrome.isPalindrome("level")

        // Assert
        assertEquals(true,result)
    }

    @Test
    fun isPalindrome_inputString_machine_expectedTrue() {

        // Arrange
        //val palindrome = Palindrome()

        // Act
        val result = palindrome.isPalindrome("machine")

        // Assert
        assertEquals(false,result)
    }

    @Test
    fun isPalindrome_inputString__expectedTrue() {

        // Arrange
        //val palindrome = Palindrome()

        // Act
        val result = palindrome.isPalindrome("")

        // Assert
        assertEquals(true,result)
    }

}