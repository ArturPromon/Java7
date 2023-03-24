package com.company;

public class CarEngine extends CarDemo {
    String FuelType;

    CarEngine(String mark, String model, String color, int price, String FuelType){
        super(mark, model, color, price);
        this.FuelType = FuelType;
    }
}
