package com.array;

import java.util.Arrays;

public class CompareArray {

    public static void main(String[] args) {

        int[] n1 = {5, 115, 45};
        int[] n2 = {8, 5, 89};

        if (Arrays.equals(n1, n2)) {
            System.out.println("Both Arrays Are Equal AHAHAHAHAH");
        } else {
            System.out.println("Both Arrays Aren't Equal");
        }
        int len = n1.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (n1[i] > max) {
                max = n1[i];
            }
            if (n2[i] > max) {
                max = n2[i];
            }
        }
        System.out.print("max element is:" + max);
    }
}
