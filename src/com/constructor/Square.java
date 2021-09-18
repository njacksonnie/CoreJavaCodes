package com.constructor;

public class Square extends Rectangle {
    Square(int length, int breadth) {
        super(length, breadth);
    }

    public static void main(String[] args) {
        Square sq = new Square(20, 10);

        sq.getSide();
        sq.getArea();
    }
}
