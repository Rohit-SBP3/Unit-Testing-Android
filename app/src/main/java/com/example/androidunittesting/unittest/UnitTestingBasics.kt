package com.example.androidunittesting.unittest

/***

   Unit Testing in Android:

       Unit testing is a critical practice in Android development that helps ensure your app's components
       work as expected in isolation. Here's everything you need to know about implementing effective
       unit tests in Android.

   Core Concepts
    What is Unit Testing?
       - Tests individual units (classes, methods) in isolation
       - Fast execution (typically milliseconds per test)
       - Doesn't require Android device/emulator
       - Focuses on business logic rather than UI

    Unit Test:
      -> JVM Test: Local Unit Test.
      -> On Device Test (Instrumentation Test):
            -> UI Tests (Interaction with views)
            -> Non UI Tests (Context, Assets Manager etc.)

    JUnit - JVM Tests.
    Mockito - Mock Objects or Fake Objects
    Espresso - UI Interactions
 */

/*** Unit Test Structure

   fun testFunctionName() {
        Arrange: Prepare inputs and expected result
        Act: Call the function under test
        Assert: Verify the result is as expected
   }

   Example:- @Test
             fun testCalculateDifference_edgeCase() {
                 // Arrange
                    val n = 0
                    val m = 1
                    val expected = 0

                 // Act
                    val result = calculateDifference(n, m)

                 // Assert
                    assertEquals(expected, result)
             }

 ***/
