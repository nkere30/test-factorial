package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        Factorial numberFactorial = new Factorial();
        String factorialOfN = numberFactorial.factorial("17");
        System.out.println(factorialOfN);
    }
}
