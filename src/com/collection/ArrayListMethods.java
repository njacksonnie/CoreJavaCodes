package com.collection;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList1 = new ArrayList<>();

        stringArrayList1.add("Java");
        stringArrayList1.add("Tom");
        stringArrayList1.add("Cal");
        stringArrayList1.add("Java Script");

        ArrayList<String> stringArrayList2 = new ArrayList<>();

        stringArrayList2.add("Azure");
        stringArrayList2.add("Corvette");

        stringArrayList1.addAll(stringArrayList2);

        System.out.println(stringArrayList1);

        stringArrayList1.addAll(2, stringArrayList2);

    }
}
