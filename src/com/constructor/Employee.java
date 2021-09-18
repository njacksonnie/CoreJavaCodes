package com.constructor;

class Employee {

    int salary;
    String name;
    int address;

    Employee()   //constructor
    {
        salary = 20000;
        name = "neal";
        address = 187;
    }

    public void get()  //method
    {
        System.out.println(name + " gets " + salary + " per month" + " lives in " + address);
    }

}

class Employees {
    public static void main(String[] args) {

        EmployeeV2 ref = new EmployeeV2();
        ref.get();


    }

}