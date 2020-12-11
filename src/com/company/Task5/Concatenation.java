package com.company.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatenation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sum = "";
        while (true){
            String stopWord = reader.readLine();
            if (stopWord.equals("хватит"))
                break;
            String userWord = stopWord;
            sum =sum + userWord + ", ";


        }
        System.out.println(sum);

    }
}
