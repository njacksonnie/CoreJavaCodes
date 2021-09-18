package com.experiment;

public class FibonacciNumber {

    // 0 1 1 2 3 5 ...
    // if a = 0, b = 1 then a+b = c

    public static void main(String[] args) {

        int a = 0, b = 1;
        int c;
        for (int i = 0; i <= 14; i++) {

            c = a + b;
            System.out.println(c);
            a = b;
            b = c;


        }
    }
}
