package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Addition")
    void add() throws Exception {
        assertAll(() -> assertEquals(6, Calculator.add(2, 4)),
                () -> assertEquals(-2, Calculator.add(2, -4)),
                () -> assertNotEquals(8, Calculator.add(-4, 10)),
                () -> assertEquals(102, Calculator.add(2, 100)),
                () -> assertEquals(2, Calculator.add(0, 2)));
    }

    @Test
    @DisplayName("multiply")
    void multiply() throws Exception{
        assertAll(() -> assertEquals(6, Calculator.multiply(2, 3)),
                () -> assertEquals(-8, Calculator.multiply(2, -4)),
                () -> assertNotEquals(8, Calculator.multiply(4, 4)),
                () -> assertEquals(0, Calculator.multiply(2, 0)),
                () -> assertEquals(0, Calculator.multiply(0, 2)));
    }

    @Test
    @DisplayName("Subtraction")
    void subtract() throws Exception{
        assertNotEquals(-7, Calculator.subtract(13, 6));
        assertEquals(6, Calculator.subtract(13, 7));
        assertEquals(-6, Calculator.subtract(1, 7));
    }

    @Test
    @DisplayName("Divide")
    void divide() throws Exception{
        assertAll(() -> assertEquals(2, Calculator.divide(2, 1)),
                () -> assertEquals(-0.5, Calculator.divide(2, -4)),
                () -> assertNotEquals(16, Calculator.divide(-4, -4)),
                () -> assertNotEquals(0, Calculator.divide(2, 0)),
                () -> assertEquals(0, Calculator.divide(0, 2)));
    }
}