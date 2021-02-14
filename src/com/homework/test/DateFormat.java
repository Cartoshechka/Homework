package com.homework.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("1997-10-05");
        System.out.println(date);
        date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(date);


    }
}
