package com.company.session5;

public class Car {
    int engineNo;
    String company;
    String modelName;
    private int price;
    String color;
    int horsePower;
    int mileage;

    public int getPrice() {
        if (price == 0) {
            System.out.println("Price is not set");
        }
        return price;
    }

    public void setPrice(int price) {
        if (price > 4500000) {
            System.out.println("Price given is more than the price policy.");
        } else {
            this.price = price;
        }
    }
}
