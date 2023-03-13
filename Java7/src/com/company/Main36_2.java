package com.company;

public class Main36_2 {
    public static void main(String[] args) {
        int[] array = {5,67,1,3,8,23,8,0,4,12,-12,143,7,46};
        int[] arrayMaxMin = GetMaxAndMinValues(array);
        int max = arrayMaxMin[0];
        int min = arrayMaxMin[1];
        System.out.println("Min value from array is " + min + "\n" + "Max value from array is " + max);
    }
    public static int[] GetMaxAndMinValues(int[] array){
        int max,min;
        max=min=0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            if(min>array[i]){
                min = array[i];
            }
        }
        int[] arrayMaxMin = new int[2];
        arrayMaxMin[0] = max;
        arrayMaxMin[1] = min;
        return arrayMaxMin;
    }
}
