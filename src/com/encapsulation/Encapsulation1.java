package com.encapsulation;

class myWorker {

    private String firstName;
    private String lastName;

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Encapsulation1 {

    public static void main(String[] args) {

        myWorker ref = new myWorker();
        ref.setfirstName("Niloy");
        ref.setlastName("Mazumder");
        System.out.println(ref.getfirstName());
        System.out.println(ref.getLastName());
    }
}