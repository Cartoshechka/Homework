package com.homework.task25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.homework.task25.DateFormattEnum.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LocalDate userDate = LocalDate.parse(reader.readLine());
        System.out.println(String.format("Use format type: %s, %s, %s, %s, %s, %s, %s", SLASH, UNDERSCORE, VERTICAL_BAR, COLON, ASTERISK,MONTH_LETTERS,TWO_DIGITS_OF_YEAR ));
        String input;
        while (!(input = reader.readLine()).isEmpty()) {
            DateFormattEnum inputEnum = DateFormattEnum.valueOf(input.toUpperCase());
            switch (inputEnum){
                case SLASH:
                    System.out.println(userDate.format(DateTimeFormatter.ofPattern("y/MM/dd")));
                    break;
                case UNDERSCORE:
                    System.out.println( userDate.format(DateTimeFormatter.ofPattern("y_MM_dd")));
                    break;
                case VERTICAL_BAR:
                    System.out.println(userDate.format(DateTimeFormatter.ofPattern("y|MM|dd")));
                    break;
                case COLON:
                    System.out.println(userDate.format(DateTimeFormatter.ofPattern("y:MM:dd")));
                    break;
                case ASTERISK:
                    System.out.println(userDate.format(DateTimeFormatter.ofPattern("y*MM*dd")));
                    break;
                case MONTH_LETTERS:
                    System.out.println(userDate.format(DateTimeFormatter.ofPattern("y-MMMM-dd")));
                    break;
                case TWO_DIGITS_OF_YEAR:
                    System.out.println(userDate.format(DateTimeFormatter.ofPattern("yy-MM-dd")));
                    break;
                default:
                    System.out.println("Case not found");
            }
        }


    }
}
