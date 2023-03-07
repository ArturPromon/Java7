package com.company;

import java.util.Arrays;

public class Main28_2 {
    public static void main(String[] args) {
        int[] array = new int[] {1,1,5,5,5,5,76,3,4,3,-1,1,-1,1,-1};
        Arrays.sort(array);
        int someValue = array[0];
        System.out.println(someValue);
        for(int i = 1; i < array.length;i++){
            if(someValue != array[i]){
                someValue = array[i];
                System.out.println(someValue);
            }
        }
    }
}
