package com.example.calculator;

public class Calculator {

    // Adds two integers and returns the sum.
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts the second integer from the first and returns the difference.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers and returns the product.
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides the first integer by the second and returns the quotient.
    // Throws ArithmeticException if b is zero.
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
