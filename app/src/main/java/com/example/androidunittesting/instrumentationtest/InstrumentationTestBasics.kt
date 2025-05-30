package com.example.androidunittesting.instrumentationtest

/***

✅ What is Instrumentation Test?
   Instrumentation Tests are used to test UI and interaction between components in a real
   Android environment.

   - Runs on actual device or emulator
   - Used for UI testing, integration testing, end-to-end testing
   - Uses AndroidJUnitRunner as the test runner

✅ Types:
   Non-UI (Similar to JUnit Tests)
   UI (Espresso)

class ContextInstrumentationTest {

    @Test
    fun testUseAppContext() {

        // Arrange – Get context of the app under test
        val appContext: Context = ApplicationProvider.getApplicationContext()

       // Act – Access package name or resources
       val actualPackageName = appContext.packageName

       // Assert – Validate expected behavior
       assertEquals("com.example.myapp", actualPackageName)

    }
}

*/

// Example Code is in Quotify App
