package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // TODO: Write a unit test for the add() method.
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        // Example test: Check if 2 + 3 equals 5
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }

    // TODO: Write a unit test for the subtract() method.
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        // Example test: Check if 5 - 3 equals 2
        assertEquals(2, calc.subtract(5, 3), "5 - 3 should equal 2");
    }

    // TODO: Write a unit test for the multiply() method.
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        // Example test: Check if 4 * 3 equals 12
        assertEquals(12, calc.multiply(4, 3), "4 * 3 should equal 12");
    }

    // TODO: Write a unit test for the divide() method.
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        // Example test: Check if 10 / 2 equals 5
        assertEquals(5, calc.divide(10, 2), "10 / 2 should equal 5");
    }

    // TODO: Write a unit test that ensures divide() throws an ArithmeticException when dividing by zero.
    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        // Check that an ArithmeticException is thrown when dividing by zero.
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0), "Division by zero should throw ArithmeticException");
    }
}
