package com.company;

public class Main14 {
    public static void main(String[] args){
//        int i = 2;
//        i+=5;
        float sum = 0;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,234,2,5,57,4,42,4,6};
        for(int i = 0; i < numbers.length; i++){
            sum+= numbers[i];
        }
        float average = sum / numbers.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
