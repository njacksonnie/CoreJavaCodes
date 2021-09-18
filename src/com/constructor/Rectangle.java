package com.constructor;

public class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getSide() {
        int s1 = 2 * (length + breadth);
        System.out.println("Perimeter is : " + s1);
    }

    public void getArea() {
        int s2 = (length * breadth);
        System.out.println("Area is : " + s2);
    }
}
