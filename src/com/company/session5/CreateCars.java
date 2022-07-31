package com.company.session5;

public class CreateCars {
    public static void main(String[] args) {

        Car gli = new Car();
        gli.engineNo = 1000;
        gli.color = "Red";
        gli.horsePower = 1300;
        gli.mileage = 0;
        gli.modelName = "GLI";
        gli.company = "Toyota";
       gli.setPrice(5000000);

        showCar(gli);
    }

    public static void showCar (Car car)
    {
        System.out.println("Engine No : " + car.engineNo);
        System.out.println("Company : " + car.company);
        System.out.println("Horse Power : " + car.horsePower);
        System.out.println("Model : " + car.modelName);
        System.out.println("Color : " + car.color);
        System.out.println("Mileage : " + car.mileage);
        System.out.println("Price : " + car.getPrice());
    }

}
