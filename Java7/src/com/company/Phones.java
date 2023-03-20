package com.company;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo Apple = new PhonesDemo();
        PhonesDemo Samsung = new PhonesDemo();
        PhonesDemo Nokia = new PhonesDemo("3310", 100, 2);
        PhonesDemo2 Xiaomi = new PhonesDemo2("Z10", 200, 128, "Black");
        PhonesDemo3 Motorola = new PhonesDemo3("Android KitKat 6", "intel");
        PhonesDemo3 LG = new PhonesDemo3("5556", "Back", 500, 512, "Android Lollipop", "Core-6");
        Apple.model = "XR";
        Apple.price = 600;
        Apple.memory = 128;
        Samsung.memory = 256;
        Samsung.price = 400;
        Samsung.model = "S21";
        System.out.println(Apple.model + " " + Apple.memory + " " + Apple.price);
        System.out.println(Samsung.model + " " + Samsung.memory + " " + Samsung.price);
        System.out.println(Nokia.model + " " + Nokia.memory + " " + Nokia.price);
        System.out.println(Xiaomi.model + " " + Xiaomi.memory + " " + Xiaomi.price + " " + Xiaomi.color);
        System.out.println(Motorola.cpu + " " + Motorola.systems);
        System.out.println(LG.model + " " + LG.memory + " " + LG.price + " " + LG.cpu + " " + LG.color + " " + LG.systems);
    }
}
