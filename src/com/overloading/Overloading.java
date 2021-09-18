package com.overloading;

public class Overloading {
    public static void main(String[] args) {

        int x = add(5, 7, 9, 7);
        double y = add(2.0, 6.0, 8.0, 78.0);

    }

    public static int add(int a, int b) {
        int add = a + b;
        System.out.println("Overloaded Method 1: " + add);
        return add;
    }

    public static int add(int a, int b, int c) {
        int add = a + b + c;
        System.out.println("Overloaded Method 2: " + add);
        return add;
    }

    public static int add(int a, int b, int c, int d) {
        int add = a + b + c + d;
        System.out.println("Overloaded Method 3: " + add);
        return add;
    }

    public static double add(double a, double b) {
        double add = a + b;
        System.out.println("Overloaded Method 4: " + add);
        return add;
    }

    public static double add(double a, double b, double c) {
        double add = a + b + c;
        System.out.println("Overloaded Method 5: " + add);
        return add;
    }

    public static double add(double a, double b, double c, double d) {
        double add = a + b + c + d;
        System.out.println("Overloaded Method 6: " + add);
        return add;
    }
}
