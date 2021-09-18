package com.loop;

public class NestedIfDemo {

    public static void main(String[] args) {

        int i = 70;

        if (i == 60) {
            System.out.println("i is 50");
            if (i < 75) {
                System.out.println("i is smaller than 75");
                if (i < 90) {
                    System.out.println("i is also smaller than 55");
                }
            }
        }
    }
}
