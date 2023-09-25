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

    @Test
    public void regularInputTest12() {
        String factorialOfN = factorial.factorial("12");
        Assertions.assertEquals("479001600", factorialOfN);
    }

    @Test
    public void regularInputTest15() {
        String factorialOfN = factorial.factorial("15");
        Assertions.assertEquals("1307674368000", factorialOfN);
    }

    @Test
    public void regularInputTest25() {
        String factorialOfN = factorial.factorial("50");
        Assertions.assertEquals("30414093201713378043612608166064768844377641568960512000000000000", factorialOfN);
    }
}
