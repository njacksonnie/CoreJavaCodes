package com.data.operation;

public class NonPrimitiveDataType {

    public static void main(String[] args) {
        String str = "niloy";
        System.out.println("String is: " + str);

        String str1 = new String("test");
        System.out.println("Another string: " + str1);

        int[] arr;
        arr = new int[3];
        arr[0] = 7;
        arr[1] = 1;
        arr[2] = 2;

        System.out.println(arr);
        System.out.println(arr[2]);

    }

}
