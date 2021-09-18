package com.exception;

public class ExceptionPrintMethod {

    public static void main(String[] args) {

        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            // e.printStackTrace();                         Method 1
            // System.out.println(e);                       Method 2
            // System.out.println(e.toString());            Method 2
            // System.out.println(e.getMessage());          Method 3
        }
    }
}
