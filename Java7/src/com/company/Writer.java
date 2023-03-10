package com.company;

import java.io.File;
import java.io.PrintWriter;

public class Writer {
    public static void main(String[] args) {
        try{
            File file = new File("src/com/company/test.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
//            PrintWriter pw = new PrintWriter(file);
//            pw.println("Hello world");
//            pw.println("Artur");
//            pw.println("Happy new year!");
//            pw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
