package com.experiment;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        int x, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        x = scanner.nextInt();

        for (sum = 0; x != 0; x /= 10) {

            sum = sum + (x % 10);
        }
        System.out.println("Sum of digits " + sum);
    }

}