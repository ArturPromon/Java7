package com.company;

public class Car {
    public static void main(String[] args) {
        CarGearbox car1 = new CarGearbox("Audi", "A6", "Black", 55000,
                "Gasoline", "Automatic");
        System.out.println(car1.mark + " " + car1.model + " " + car1.color + " " + car1.price
                + " " + car1.FuelType + " " + car1.GearType );
    }
}
