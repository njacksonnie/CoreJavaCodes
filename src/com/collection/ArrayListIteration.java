package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Tom");
        studentList.add("Neal");
        studentList.add("Steve");
        studentList.add("Bro");

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        for (String s : studentList) {
            System.out.println(s);
        }

        Iterator<String> it = studentList.iterator();
        while (it.hasNext()) {
            System.out.println(it.hasNext());
        }
    }
}
