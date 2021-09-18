package com.string;

public class StringDemo1 {

    public static void main(String[] args) {


        String x = new String("hello ");

        x = x.concat("neal");

        System.out.println(x);

        String city1 = "Kolkata";
        String city2 = "Kolkata";
        String city3 = "Kolkata";
        String city4 = "Delhi";
        city4 = "Kolkata";

        System.out.println(city4);
    }
}
