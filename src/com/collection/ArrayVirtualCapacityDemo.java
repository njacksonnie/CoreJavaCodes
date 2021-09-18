package com.collection;

import java.util.ArrayList;

public class ArrayVirtualCapacityDemo {

    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<Object>(20);

        /* Initial virtual capacity of ArrayList is 10, this is not physical capacity which is 0 by default */

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(400);

        System.out.println(arrayList.size());

    }
}
