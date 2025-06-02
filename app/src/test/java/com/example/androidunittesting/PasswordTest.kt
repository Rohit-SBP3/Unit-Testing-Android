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
    fun reversePasswordString_input_null_expected_false() {

        // Act
        val res = password.reversePasswordString("")

        //assert
        assertEquals("",res)

    }

}