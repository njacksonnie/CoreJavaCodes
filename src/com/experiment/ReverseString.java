package com.experiment;

public class ReverseString {

    public static void main(String[] args) {

        String name = "njacksonnie";
        int length = name.length();
        String revS = "";

        for (int i = length - 1; i >= 0; i--) {

            revS = revS + name.charAt(i); //new StringBuilder().append(revS).append(name.charAt(i)).toString();
        }
        if (name.equals(revS)) {   // to check if the original value and calculated reverse value is same or not

            System.out.println(name + " is palindrome");
        } else {

            System.out.println(name + " is not a palindrome");
        }

        System.out.println(" Reverse of " + "name" + " is " + revS);
    }
}