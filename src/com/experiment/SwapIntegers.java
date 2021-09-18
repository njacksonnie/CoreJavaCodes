package com.experiment;

public class SwapIntegers {

    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        int z; // let's say z is an empty box

        z = x; // Transfer of all value of x to z. Now x is empty
        x = y; // Transfer of all value of y to x. Now y is empty
        y = z; // Transfer of all value of z to y. Now z is empty

        // x and y both have been swapped

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
}
