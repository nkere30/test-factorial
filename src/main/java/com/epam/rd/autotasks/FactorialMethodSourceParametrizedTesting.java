package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FactorialMethodSourceParametrizedTesting {

    Factorial factorial = new Factorial();

    @ParameterizedTest
    @MethodSource("testCases")
    void testFactorial(String in, String expected) {
        String factorialInput = factorial.factorial(in);
        Assertions.assertEquals(factorialInput, expected);
    }

    public static Stream<String[]> testCases() {
        return Stream.of(
                new String[]{"1", "1"},
                new String[]{"2", "2"},
                new String[]{"5", "120"}
        );
    }
}
