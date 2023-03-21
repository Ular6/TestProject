package com.example.testproject

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val rule : ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.etOne)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.etTwo)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResult)).check(
                ViewAssertions.matches(ViewMatchers.withText("10"))
            )
        }
    }

    @Test
    fun checkEmailFalse() {
        runBlocking {
            Espresso.onView(withId(R.id.etEmail)).perform(ViewActions.typeText("test"))
            delay(1500)
            Espresso.onView(withId(R.id.btnCheckEmail)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResult)).check(
                ViewAssertions.matches(ViewMatchers.withText("false")))
        }
    }

    @Test
    fun checkEmailTrue() {
        runBlocking {
            Espresso.onView(withId(R.id.etEmail)).perform(ViewActions.typeText("test@gmail.com"))
            delay(1500)
            Espresso.onView(withId(R.id.btnCheckEmail)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResult)).check(
                ViewAssertions.matches(ViewMatchers.withText("true")))
        }
    }

    @Test
    fun checkNumberFalse() {
        runBlocking {
            Espresso.onView(withId(R.id.etNumber)).perform(ViewActions.typeText("1234567"))
            delay(1500)
            Espresso.onView(withId(R.id.btnCheckNumber)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResultNumber)).check(
                ViewAssertions.matches(ViewMatchers.withText("false"))
            )
        }
    }

    @Test
    fun checkNumberTrue() {
        runBlocking {
            Espresso.onView(withId(R.id.etNumber)).perform(ViewActions.typeText("555555555"))
            delay(1500)
            Espresso.onView(withId(R.id.btnCheckNumber)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResultNumber)).check(
                ViewAssertions.matches(ViewMatchers.withText("true")))
        }
    }
}