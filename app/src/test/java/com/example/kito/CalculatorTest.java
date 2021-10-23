package com.example.kito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void evaluatesExpression() {
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}