package com.company.session5;

public class Human {
    public String name = "Amna";
    public int age = 25;
    private int CNIC = 35345353;
    private int bankBalance = 10000000;
    private int tax;

    public int getCNIC() {
        return CNIC;
    }

    public int calculateTax() {
        if (bankBalance >= 10000000) {
            tax = 500000;
        }

        return tax;
    }

    //Testing Madni User Name
}
