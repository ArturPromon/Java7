package com.company;

public class kt3 {
    public static void main(String[] args) {
        int[] array = {188, 181, 156, 162, 171, 152, 169, 193, 185, 183};
        int average = 0;
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            average = (average + array[i]);
        }
        average = average / length;
        System.out.println("Average is " + average);

        if (average % 3 == 0) {
            System.out.println("Error");
        } else {
            System.out.println("Hello");
        }
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Biggest number is " + max);
        System.out.println("Index of biggest number is " + index);
    }
}
