package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialBadInputTesting {

    @Test
    void testNullInput(){
        Factorial factorial = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class,() -> factorial.factorial(null));
    }

    @Test
    void testNegativeInput(){
        Factorial factorial = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class,() -> factorial.factorial("-10"));
    }

    @Test
    void testFractionalInput(){
        Factorial factorial = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class,() -> factorial.factorial("3.14"));
    }

    @Test
    void testNonDigitalInput(){
        Factorial factorial = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class,() -> factorial.factorial("s"));
    }


}
