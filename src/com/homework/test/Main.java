package com.homework.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(String.format("Hello %s %s" ,  "world","!!!"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine()), c = Integer.parseInt(reader.readLine());
        String template;
        if (a < 0 || b < 0 || c < 0)
            template = "Warning! a = %d, b = %d, c = %d";
        else
            template = "a = %d, b = %d, c = %d";

        System.out.println(String.format(template, a, b, c) );

    }
}
