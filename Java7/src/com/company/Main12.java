package com.company;

import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] array2 = new int[]{5,5,5,5,5,6};
        System.out.println(array[4]);
        System.out.println(Arrays.toString(array));
        int[][] array3 = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(array3[2][0]);

        int[] array4 = new int[5];
        array4[0] = 10;
        array4[1] = 20;
        array4[2] = 30;
        array4[3] = 60;
        array4[4] = 10;
        System.out.println(Arrays.toString(array4));
    }
}
