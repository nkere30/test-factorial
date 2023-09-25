package com.epam.rd.autotasks;

import java.util.Objects;

public class Factorial {

    /*
    Takes a String as a parameter, transforms it to an integer value and counts its factorial and returns a result as a String.
     */
    public String factorial(String n) {
        if (isBadInput(n)) throw new IllegalArgumentException();
        int factorialStrToInt = Integer.parseInt(n); //Transform string to int
        int factorialOfN = 1;
        for(int i = 1; i <= factorialStrToInt; i++) {
            factorialOfN = factorialOfN * i;
        }
        return Integer.toString(factorialOfN);
    }

    public boolean isBadInput(String n) {
        return (Objects.equals(n, null)) || (n.matches("^-?\\d+\\.\\d+$"))
                || (n.matches("^[a-zA-Z]+$")) || (n.matches("^-?\\d+$") && Integer.parseInt(n) < 0)
                || (n.isEmpty() || (n.matches(".*\\s+.*")));
    }
}
