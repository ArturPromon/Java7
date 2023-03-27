package com.company;

public class Final_Static {
    public static void main(String[] args) {
        int x = Final_Static_demo.a;
        System.out.println(x);
        Final_Static_demo object = new Final_Static_demo();
        int x2 = object.b;
        System.out.println(object.Doo(10));
        Final_Static_demo.a = 20;
//        object.b = 20;
        System.out.println(x);
        System.out.println(Final_Static_demo.a);
        System.out.println(object.b);
    }
}
