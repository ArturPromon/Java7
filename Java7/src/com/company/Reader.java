package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Reader {
    public static void main(String[] args) {
        BufferedReader file = null;
        String[] array;
        int count = 0;
        try{
            file = new BufferedReader(new FileReader("src/com/company/Artur.txt"));
            String line;
            String format_line;
            while((line = file.readLine()) !=null){
                format_line = "";
                for(int i = 0; i<line.length();i++){
                    if(line.charAt(i) != ','){
                        format_line +=  line.charAt(i);
                    }
                }
                array = format_line.split(" ");
                System.out.println(line);
                System.out.println(Arrays.toString(array));
                for(int i = 0; i< array.length; i++){
                    if(array[i].equals("Baby") || array[i].equals("baby")){
                        count++;
                    }
                }
                System.out.println(count);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
