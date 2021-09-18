package com.method;

class Vehicle {
    int passenger;
    int fuel;
    int mpg;
}

class Owner {

    String nameMy = "neal";
    String nameLast = "mazumder";
}

class Ownership extends Owner {

    public void show() {
        System.out.println(nameMy + " " + nameLast);
    }
}

public class MethodDemo {

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passenger = 7;
        minivan.fuel = 16;
        minivan.mpg = 21;

        range = minivan.fuel * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passenger + " with range of " + range);

        Ownership ref = new Ownership();
        ref.show();
    }

}
