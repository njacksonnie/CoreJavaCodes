package com.exception;

public class TryCatchDemo {

    public static void main(String[] args) {

        int a = 10, b = 0, c;
        try {                                             // risky code should be in this block
            c = b / a;
            System.out.println(c);
        } catch (ArithmeticException e) {                    // handling code

            System.out.println("Can't divide by zero");
        }

        System.out.println("main method ended");
    }
}
