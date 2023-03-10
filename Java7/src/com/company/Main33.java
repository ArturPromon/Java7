package com.company;

public class Main33 {
    public static void function(){
        int num1, num2, num3;
        num1 = 10;
        num2 = 20;
        num3 = num1 + num2;
        System.out.println(num3);
        System.out.println(function2(10,20));
    }
    public static void main(String[] args) {
        function();

    }
    public static int function2(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

}

