package com.encapsulation;

public class Encapsulation {

    public static void main(String[] args) {

        Train train = new Train("Mustang", 2021, 9999.99);

        train.setModel("Corvette");
        train.setYear(2022);
        train.setPrice(5000);

        System.out.println(train.getModel());
        System.out.println(train.getYear());
        System.out.println(train.getPrice());
    }

}