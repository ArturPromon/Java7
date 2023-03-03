package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        int count = 0;
        int total_letters = 0;
        int total_words = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write some word or sentences: ");
        String someString = scn.nextLine();
        System.out.println("Please write some character: ");
        char someChar = scn.next().charAt(0);
        String[] array = someString.split(" ");
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < someString.length(); i++){
            if(someString.charAt(i) == someChar){
                count++;
            }
            if(someString.charAt(i) != ' '){
                total_letters++;
            }
        }
        for(String word:array){
            if(!word.equals("")){
                total_words++;
            }

        }
        System.out.println("In a word/sentences '" + someString + "' character '" + someChar + "' seems " + count + " time(s)");
        System.out.println("in a word/sentences '" + someString + "' total letters is " + total_letters + " pc");
        System.out.println("Total words " + total_words);
        System.out.println("length "+ array.length);
    }
}
