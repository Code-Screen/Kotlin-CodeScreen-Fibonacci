package dev.codescreen.fibonacci

import org.junit.Test
import org.junit.Assert.assertEquals

class FibonacciCalculatorTest {

    @Test
    fun test1() {
        assertEquals(0, FibonacciCalculator.calculate(0))
    }

    @Test
    fun test2() {
        assertEquals(5, FibonacciCalculator.calculate(5))
    }

    @Test
    fun test3() {
        assertEquals(6765, FibonacciCalculator.calculate(20))
    }

    @Test
    fun test4() {
        assertEquals(75025, FibonacciCalculator.calculate(25))
    }

}
