package com.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        Cycle cycle = new Cycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, cycle, boat};

        car.go();
        cycle.go();
        boat.go();
    }
}


