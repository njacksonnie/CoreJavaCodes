package com.exception;

public class GlobalString {

    public String getGlobal;

    GlobalString() {

        getGlobal = "America";
    }

    public void getLength() {
        try {

            System.out.println(getGlobal.length());
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        GlobalString gs = new GlobalString();

        gs.getLength();

    }
}
