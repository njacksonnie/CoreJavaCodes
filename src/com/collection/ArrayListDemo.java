package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args) {

        int[] i = new int[4];

        i[0] = 100;

        ArrayList<Object> arrayList = new ArrayList<>();  // as ArrayList is a default class

        arrayList.add(100);  // way to add items
        arrayList.add("test");
        arrayList.add(12.33);
        arrayList.add('t');
        arrayList.add(true);

        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());

        arrayList.add(500);
        arrayList.add(600);

        System.out.println(arrayList.size());

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        System.out.println(number);
    }
}
