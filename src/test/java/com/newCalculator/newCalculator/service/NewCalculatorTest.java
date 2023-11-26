package com.newCalculator.newCalculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewCalculatorTest {
    private final NewCalculatorServiceImpl out = new NewCalculatorServiceImpl();

    public static Stream<Arguments> plusMethodCombinations() {
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(5,5,10),
                Arguments.of(50,100,150)
        );
    }

    @ParameterizedTest
    @MethodSource ("plusMethodCombinations")
    void plus(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.plus(a, b));

    }
    @ParameterizedTest
    @CsvSource(value = {"5,5,0", "2,2,0", "10,5,5"})
    void minus(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.minus(a, b));

    }
    @ParameterizedTest
    @CsvSource(value = {"1,2,2", "2,2,4", "5,5,25"})
    void multiply(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.multiply(a, b));

    }
    @ParameterizedTest
    @CsvSource(value = {"4,2,2", "25,5,5", "100,10,10"})
    void divide (Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.divide(a, b));

    }
}
