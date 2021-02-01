package com.homework.task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> family = new HashMap<>();
        while (true) {
            System.out.println("Set city name or press enter");
            String sity = reader.readLine();
            if (sity.isEmpty()) {
                break;
            } else if (family.containsKey(sity)){
                System.out.println("Please chhose another city name this city name is already registered");
                sity = reader.readLine();
            }
            System.out.println("Set surname or press enter");
            String surname = reader.readLine();
            if (surname.isEmpty()) {
                break;
            }
            family.put(sity, surname);
        }
        System.out.println("Print city name to find surname");
        String lookForCity = reader.readLine();

        System.out.println(family.getOrDefault(lookForCity, "We cannot find this city"));


    }
}
