package com.experiment;

public class ReverseNumber {

    public static void main(String[] args) {

        int n1 = 1881;
        int cakeSwap = n1;   // new variable for swapping digit with each other
        // n1 & cakeSwap has same value till this point
        int revN = 0;        // to store the reverse number that we wil create
        int remainder;       // for reverse number calculation purpose

        while (cakeSwap != 0) {

            remainder = cakeSwap % 10;
            revN = revN * 10 + remainder;
            cakeSwap = cakeSwap / 10;

        }
        if (n1 == revN) {   // to check if the original value and calculated reverse value is same or not

            System.out.println(n1 + " is palindrome");
        } else {

            System.out.println(n1 + " is not a palindrome");
        }

        System.out.println("Reverse Number: " + revN);
    }
}
