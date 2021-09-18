package com.array;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

    public static void main(String[] args) {

        Integer[] marks = {56, 59, 14, 99, 21, 4, 30, 48};

        // Sorting int Array in descending order
        Arrays.sort(marks, Collections.reverseOrder());

        // Displaying elements of int Array
        System.out.println("Array Elements in reverse order: ");
        for (Integer mark : marks) System.out.println(mark);
    }
}
