package com.constructor;

class EmployeeV2 {

    int salary;
    String name;
    int address;

    EmployeeV2()   //constructor
    {
        salary = 20000;
        name = "niloy";
        address = 187;
    }

    public void get()  //method
    {
        System.out.println(name + " gets " + salary + " per month" + " lives in " + address);
    }

}

class EmployeesV2 {
    public static void main(String[] args) {

        EmployeeV2 ref = new EmployeeV2();
        ref.get();
    }
}