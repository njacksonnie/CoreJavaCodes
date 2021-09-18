package com.experiment;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = scanner.nextInt();
        int n = 0;

        for (int i = 2; i < x; i++) {

            if ((x % i) == 0) {

                n++;
            }
        }
        if (n == 0) {

            System.out.println("Number is prime");
        } else {

            System.out.println("Number is not prime");
        }
    }
}
