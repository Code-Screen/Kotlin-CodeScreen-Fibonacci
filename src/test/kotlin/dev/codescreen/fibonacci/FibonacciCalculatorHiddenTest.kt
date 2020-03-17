package dev.codescreen.fibonacci

import org.junit.Test
import org.junit.Assert.assertEquals

class FibonacciCalculatorHiddenTest {

    @Test
    fun testHidden1() {
        assertEquals(377, FibonacciCalculator.calculate(14))
    }

    @Test
    fun testHidden2() {
        assertEquals(610, FibonacciCalculator.calculate(15))
    }

    @Test
    fun testHidden3() {
        assertEquals(2584, FibonacciCalculator.calculate(18))
    }

    @Test
    fun testHidden4() {
        assertEquals(4181, FibonacciCalculator.calculate(19))
    }

}
