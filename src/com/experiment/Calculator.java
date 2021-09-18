package com.experiment;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        char c;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int x = sc.nextInt();
            System.out.println("Enter second number");
            int y = sc.nextInt();
            System.out.println("Enter choice : add 1, mult 2, sub 3, divide 4");
            int ch = sc.nextInt();
            double returnValue = 0;
            switch (ch) {
                case 1:
                    returnValue = add(x, y);
                    System.out.println(returnValue);
                    break;
                case 2:
                    returnValue = mult(x, y);
                    System.out.println(returnValue);
                    break;
                case 3:
                    returnValue = sub(x, y);
                    System.out.println(returnValue);
                    break;
                case 4:
                    returnValue = divide(x, y);
                    System.out.println(returnValue);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
            System.out.println("Do you want to Continue?");
            String str = sc.next();
            c = str.charAt(0);
        } while (c == 'Y' || c == 'y');
    }

    public static double add(int x, int y) {
        return x + y;
    }

    public static double mult(int x, int y) {
        return x * y;
    }

    public static double sub(int x, int y) {
        return x - y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }
}
