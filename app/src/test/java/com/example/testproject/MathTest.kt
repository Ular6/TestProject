package com.example.testproject

import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class MathTest {

    var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun simpleAddCase() {
        assertEquals("4", math?.plus("2", "2"))
    }

    @Test
    fun checkEmpty() {
        assertEquals("3", math?.plus("1", "2"))
    }

    @Test
    fun symbol() {
        assertEquals("Нельзя сложить буквы", math?.plus("d", "s"))
    }

    @Test
    fun checkEmailTrue() {
        assertEquals(true, math?.checkEmail("test@gmail.com"))
    }

    @Test
    fun checkEmailFalse() {
        assertEquals(false, math?.checkEmail("test"))
    }

    @Test
    fun checkNumberWithFalse() {
        assertEquals(false, math?.numberCheck("1234567"))
    }

//    @Test
//    fun checkNumberWithWrongLength() {
//        assertEquals(false, math?.numberCheck("1234567"))
//    }

    @Test
    fun checkNumberWithTrue() {
        assertEquals(true, math?.numberCheck("555555555"))
    }

    @Test
    fun simpleAddWithDouble() {
        assertEquals(4.0, math?.plusDouble(2.0, 2.0))
    }

    @After
    fun after() {
        math = null
    }
}