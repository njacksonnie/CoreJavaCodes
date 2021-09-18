package com.exception;

public class FinallyDemo {

    public static void main(String[] args) {

        int a = 100, b = 0, c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println(" I am in finally block");
        }
    }
}
