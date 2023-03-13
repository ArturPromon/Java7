package com.company;

public class Main35 {
    public static void main(String[] args) {
        boolean isTrue = OddOrEven(128);
        System.out.println(isTrue);
    }
    public static boolean OddOrEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
