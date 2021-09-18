package com.constructor;

public class Emloyees {

    int rollNumber;
    String empName;
    String departmentName;
    int grade;


    Emloyees(int rollNumber, String empName, String departmentName, int grade)   //parameterized  //formal parameter
    {
        this.rollNumber = rollNumber;
        this.empName = empName;
        this.departmentName = departmentName;
        this.grade = grade;
        System.out.println(rollNumber + " " + empName + " " + departmentName + " " + grade);
    }

    void show() {  // how to use a method after a formal constructor?
        System.out.println(" hello world");
        System.out.println(rollNumber + " " + empName);
    }

    public static void main(String[] args) {

        //how to use this. in main method

        new Emloyees(1, "Niloy", "CS", 60);     //object
        new Emloyees(2, "Pradipta", "CS", 90);
        new Emloyees(3, "Souvik", "CS", 65);
        new Emloyees(4, "Anupam", "CS", 75);   //actual parameter


    }


}