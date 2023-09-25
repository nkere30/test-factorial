package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialRegularInputTesting {
    Factorial factorial = new Factorial();

    @Test
    public void regularInputTest() {
        String factorialOfN = factorial.factorial("5");
        Assertions.assertEquals("120", factorialOfN);
    }
}
