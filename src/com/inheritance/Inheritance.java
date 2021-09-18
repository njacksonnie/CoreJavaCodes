package com.inheritance;

public class Inheritance {
    public static void main(String[] args) {

        Cars cars = new Cars();
        //cars.go();

        Bikes bikes = new Bikes();
        //bikes.stop();

        System.out.println(cars.doors);
        System.out.println(bikes.pedals);
        System.out.println(cars.sum);
    }

}
