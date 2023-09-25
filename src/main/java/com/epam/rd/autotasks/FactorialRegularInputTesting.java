package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testFactorialEmptyStringCase() {
        Factorial factorial = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class,() -> factorial.factorial(""));
    }

    @Test
    void testFactorialWhiteSpaceCase() {
        Factorial factorial = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class,() -> factorial.factorial("  "));
    }

    @Test
    void testFactorialMultipleArgumentCase() {
        Factorial factorial = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class,() -> factorial.factorial("5 12"));
    }
}
