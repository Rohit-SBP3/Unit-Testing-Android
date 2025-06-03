package com.example.androidunittesting

import com.example.androidunittesting.unittest.Password
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PasswordTest {

    lateinit var password: Password

    @Before
    fun setUp() {
        // Arrange
        password = Password()
    }

    @After
    fun tearDown() {
        println("Fucked Up!!!")
    }

    @Test
    fun validatePassword_input_Jack123_wood_expected_true() {
        // Act
        val res = password.validatePassword("Jack123_wood")

        // assert
        assertEquals(true, res)
    }

    @Test
    fun validatePassword_input_JohnW_expected_false() {
        // Act
        val res = password.validatePassword("JohnW")

        // assert
        assertEquals(false, res)
    }

    @Test
    fun validatePassword_input_John_Wick_season1234_expected_false() {
        // Act
        val res = password.validatePassword("John_Wick_season1234")

        // assert
        assertEquals(false, res)
    }

    @Test
    fun validatePassword_input__expected_false() {
        // Act
        val res = password.validatePassword("")

        // assert
        assertEquals(false, res)
    }



    @Test
    fun reversePasswordString_input__expected__() {

        // Act
        val res = password.reversePasswordString("")

        //assert
        assertEquals("",res)

    }

    @Test
    fun reversePasswordString_input_racecar_expected_racecar() {

        // Act
        val res = password.reversePasswordString("racecar")

        //assert
        assertEquals("racecar",res)

    }

    @Test
    fun reversePasswordString_input_123_expected_racecar() {

        // Act
        val res = password.reversePasswordString("123")

        //assert
        assertEquals("321",res)

    }

}