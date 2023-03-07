package com.company;

import java.util.Arrays;

public class Main28 {
    public static void main(String[] args) {
        int[] array = new int[] {1,1,5,5,5,5,76,3,4,3,-1,1,-1,1,-1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int length = 1;
        for(int i = 0; i< array.length; i++){
            if(max<array[i]){
                max = array[i];
                length++;
            }
        }
        int index = 1;
        int[] array2 = new int[length];
        array2[0] = array[0];
        max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max<array[i]){
                max = array[i];
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
