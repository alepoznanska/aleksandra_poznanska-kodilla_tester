package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator2 = new Calculator();
        int a = 10;
        int b = 6;
        int subtractResult = calculator2.subtract(a, b);
        assertEquals(4, subtractResult);
    }
    @Test
    public void testSquare() {
        Calculator calculator3 = new Calculator();
        int a = 0;
        int squareResult = calculator3.square(a);
        assertEquals(0, squareResult);
        Calculator calculator4 = new Calculator();
        int b = 2;
        int squareResult2 = calculator4.square(b);
        assertEquals(4, squareResult2);
        Calculator calculator5 = new Calculator();
        int c = -2;
        int squareResult3 = calculator5.square(c);
        assertEquals(4, squareResult3);
    }
}