package com.company;

public class Main37 {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(5,10,30));
        System.out.println(sum(5.4f, 10.5f));
        System.out.println(sum());
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static int sum(){
        int a,b;
        a = 10;
        b = 20;
        return a + b;
    }
}


