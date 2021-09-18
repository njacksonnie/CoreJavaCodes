package com.scanner;

import java.util.Scanner;

public class ope4 {

    public static void main(String[] args) {

        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first integer number");
        int xobj = sc.nextInt();
        sc.nextLine();

        System.out.println("enter second integer number");
        int yobj = sc.nextInt();
        sc.nextLine();

        System.out.println("Sum of two number is: " + (xobj + yobj));

    }
}
