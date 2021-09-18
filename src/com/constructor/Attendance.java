package com.constructor;

public class Attendance {

    String employeeName;
    String employeedept;
    int employeeaddress;
    short employeesalary;
    double employeeefficiency;
    String employeePosition;


    Attendance(String empName, String empdept, int empaddress, short empsalary, double empefficiency, String empPosition) {
        employeeName = empName;
        employeedept = empdept;
        employeeaddress = empaddress;
        employeesalary = empsalary;
        employeeefficiency = empefficiency;
        employeePosition = empPosition;

        System.out.println(employeeName + " " + employeedept + " " + employeeaddress + " " + employeesalary + " " + employeeefficiency + " " + employeePosition);
    }

    public static void main(String[] args) {

        new Attendance("Bipul", "Service Desk", 187, (short) 5600, 3.1748789898, "A");


    }
}
