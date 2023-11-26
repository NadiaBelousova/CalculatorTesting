package com.newCalculator.newCalculator.service;

import com.newCalculator.newCalculator.exceptions.DivideException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static java.lang.Integer.MAX_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NewCalculatorServiceImplTest {
    private final NewCalculatorServiceImpl out = new NewCalculatorServiceImpl();


    @Test
    void helloIsHere() {
        String hello = "Добро пожаловать в калькулятор";
        assertEquals(hello, out.hello());
    }

    @Test
    void plus() {

        assertEquals(10, out.plus(5, 5));
        assertEquals(4, out.plus(2, 2));
    }



    @Test
    void minus() {

        assertEquals(0, out.minus(5, 5));
        assertEquals(0, out.minus(2, 2));
    }

    @Test
    void multiply() {
        assertEquals(25, out.multiply(5, 5));
        assertEquals(4, out.multiply(2, 2));
    }

    @Test
    void divide() {
        assertEquals(1, out.divide(5, 5));
        assertEquals(1, out.divide(2, 2));
    }

    @Test
    void divideByZero() {
        assertThrows(DivideException.class, () -> out.divide(MAX_VALUE, 0));
    }
}