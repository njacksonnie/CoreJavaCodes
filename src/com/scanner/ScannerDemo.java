package com.scanner;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();
        System.out.println("Enter Your Gender");
        String gender = scanner.nextLine();
        System.out.println("Enter Age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your Favourite food?");
        String food = scanner.nextLine();

        System.out.println("Your name is " + name + ", " + "you're " + age + " years old" + " and you are a " + gender + " you love " + food);


    }
}
