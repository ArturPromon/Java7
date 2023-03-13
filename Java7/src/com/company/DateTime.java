package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println(obj);
        LocalTime obj2 = LocalTime.now();
        System.out.println(obj2);
        LocalDateTime obj3 = LocalDateTime.now();
        System.out.println(obj3);
        DateTimeFormatter formatterObj = DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy HH:mm:ss");
        String formatted_Obj = obj3.format(formatterObj);
        System.out.println(formatted_Obj);
    }
}
