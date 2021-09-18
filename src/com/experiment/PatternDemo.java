package com.experiment;

import java.util.Scanner;

public class PatternDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired ROW number");
        int rowNum = scanner.nextInt();

        for (int i = 1; i <= rowNum; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= rowNum; i++) {

            for (int j = i; j <= rowNum - 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
