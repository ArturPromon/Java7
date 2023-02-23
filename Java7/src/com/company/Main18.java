package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Please enter a length of array: ");
        int length = scn.nextInt();
        String[] students_names = new String[length];
        for(int i = 0; i < length; i++){
            System.out.print("students_names[" + i + "] = ");
            students_names[i] = scn2.nextLine();
        }
        System.out.println(Arrays.toString(students_names));
    }
}
