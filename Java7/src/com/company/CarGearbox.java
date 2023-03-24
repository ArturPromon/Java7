package com.company;

public class CarGearbox extends CarEngine {
    String GearType;

    CarGearbox(String mark, String model, String color, int price, String FuelType, String GearType){
        super(mark, model, color, price, FuelType);
        this.GearType = GearType;
    }
}
