package com.company.session5;

public class ManageEncapsulatedCars {
    public static void main(String[] args) {

        EncapsulatedCar gli = createCar();
        showCar(gli);
    }

    public static EncapsulatedCar createCar() {
        EncapsulatedCar gli = new EncapsulatedCar();

        gli.setEngineNo(1000);
        gli.setColor("Red");
        gli.setHorsePower(1300);
        gli.setMileage(0);
        gli.setModelName("GLI");
        gli.setCompany("Toyota");
        gli.setPrice(5000000);

        return gli;
    }

    public static void showCar(EncapsulatedCar car) {
        System.out.println("--------------- My CAR Data ----------------");
        System.out.println("Engine No : " + car.getEngineNo());
        System.out.println("Company : " + car.getCompany());
        System.out.println("Horse Power : " + car.getHorsePower());
        System.out.println("Model : " + car.getModelName());
        System.out.println("Color : " + car.getColor());
        System.out.println("Mileage : " + car.getMileage());
        System.out.println("Price : " + car.getPrice());
    }
}
