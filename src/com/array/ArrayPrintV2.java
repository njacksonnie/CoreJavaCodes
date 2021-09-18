package com.array;

public class ArrayPrintV2 {

    public static void main(String[] args) {
        String cars[] = new String[3];

        cars[0] = "BMW";
        cars[1] = "Tesla";
        cars[2] = "Volvo";

        System.out.println(cars[2]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
