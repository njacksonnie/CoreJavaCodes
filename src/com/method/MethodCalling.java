package com.method;

public class MethodCalling {

    int salary = 40000;
    String name = "niloy";
    int address = 187;

    String departmentName = "java";
    int workingHours = 9;
    String lvl = "trainee";


    public void get() {
        System.out.println(name + " gets " + salary + " per month" + " lives in " + address);
    }

    public void show() {
        System.out.println(name + " works in " + departmentName + " on " + workingHours + " working hours" + " with designation of " + lvl);
    }

    public static void main(String[] args) {

        MethodCalling obj = new MethodCalling();
        obj.get();
        obj.show();


    }

}
