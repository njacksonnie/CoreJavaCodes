package com.data.operation;

public class ConditionalOperator {

    public static void main(String[] args) {

        int value1 = 1;
        int value2 = 2;

        if (value1 == value2)
            System.out.println("value1 == value2"); // Will not print as statement is false

        if (value1 != value2)
            System.out.println("value1 != value2"); // Printed as statement is true

        if (value1 > value2)
            System.out.println("value1 > value2");

        if (value1 < value2)
            System.out.println("value1 < value2");

        if (value1 <= value2)
            System.out.println("value1 <= value2");

        int value3 = 3;
        int value4 = 4;

        if ((value3 == 3) && (value4 == 4))
            System.out.println("value3 is 3 AND value4 is 4"); // Both statements need to be true 

        if ((value3 == 3) || (value4 == 4))
            System.out.println("value3 is 3 OR value2 is 3"); // Anyone statement needs to be true

    }

}
