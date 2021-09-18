package com.collection;

import java.util.ArrayList;

public class GenericArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> markList = new ArrayList<>(); /* Need to write wrapper class */

        markList.add(100);

        ArrayList<Double> doubleArrayList = new ArrayList<>();

        doubleArrayList.add(12.33);
        doubleArrayList.add(100.0);
    }
}
