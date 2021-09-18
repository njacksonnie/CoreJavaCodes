package com.experiment;

public class IndianTaxCalculator {

    public static void main(String[] args) {

        System.out.println("My hourly wage: " + 10);

        // x = annual income
        // y = annual taxable income
        // z = how much owing in hourly taxes
        // w = net income after tax

        int x = multiply(10, 1000);
        double y = multiply2(x, .05);
        double z = multiply3(10, .05);
        double w = netIncome(x, y);


    }

    public static int multiply(int a, int b) {
        int multiply = a * b;
        System.out.println("My annual income is: " + multiply);
        return multiply;

    }

    public static double multiply2(int c, double d) {
        double multiply2 = c * d;
        System.out.println("My annual taxable income: " + multiply2);
        return multiply2;

    }

    public static double multiply3(int e, double f) {
        double multiply3 = e * f;
        System.out.println("My hourly taxable income: " + multiply3);
        return multiply3;

    }

    public static double netIncome(int f, double g) {
        double netIncome = f - g;
        System.out.println("My Income after tax is: " + netIncome);
        return netIncome;

    }
}
