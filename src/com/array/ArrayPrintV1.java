package com.array;

public class ArrayPrintV1 {

    public static void main(String[] args) {
        int[] cars = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            cars[i] = i;
            System.out.println(cars[i]);
        }
    }
}
