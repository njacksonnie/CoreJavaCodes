package com.experiment;

public class Attendance {

    String employeeName;
    String employeeDept;
    int employeeAddress;
    short employeeSalary;
    double employeeEfficiency;
    String employeePosition;


    Attendance(String empName, String empdept, int empaddress, short empsalary, double empefficiency, String empPosition) {
        employeeName = empName;
        employeeDept = empdept;
        employeeAddress = empaddress;
        employeeSalary = empsalary;
        employeeEfficiency = empefficiency;
        employeePosition = empPosition;

        System.out.println(employeeName + " " + employeeDept + " " + employeeAddress + " " + employeeSalary + " " + employeeEfficiency + " " + employeePosition);

    }

    public static void main(String[] args) {

        new Attendance("Bipul", "Service Desk", 187, (short) 5600, 3.1748789898, "A");


    }
}
