package com.homework.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuilder1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        while (true){
            String stopWord = reader.readLine();
            if (stopWord.equals("хватит"))
                break;
            String userWord = stopWord;
            builder.append(userWord + ", ");

        }
        System.out.println(builder);
    }
}
