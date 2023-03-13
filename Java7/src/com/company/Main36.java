package com.company;

public class Main36 {
    public static void main(String[] args) {
        int[] array = {5,67,1,3,8,23,8,0,4,12,-12,143,7,46};
        int max = GetMaxValue(array);
        int min = GetMinValue(array);
        System.out.println("Min value from array is " + min + "\n" + "Max value from array is " + max);
    }
    public static int GetMaxValue(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static int GetMinValue(int[] array){
        int min = 0;
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
