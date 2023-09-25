package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        Factorial numberFactorial = new Factorial();
        String factorialOfN = numberFactorial.factorial("1 3");
        System.out.println(factorialOfN);
    }
}
