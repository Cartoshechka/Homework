package com.company.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuffer {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        java.lang.StringBuffer sum = new java.lang.StringBuffer();
        while (true){
            String stopWord = reader.readLine();
            if (stopWord.equals("хватит"))
                break;
            String userWord = stopWord;
            sum.append(userWord + ", ");

        }
        System.out.println(sum);
    }
}
