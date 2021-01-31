package com.homework.task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> family = new HashMap<>();
        System.out.println("Set city name");
        String sity = reader.readLine();
        System.out.println("Set surname");
        String surname = reader.readLine();
        family.put(sity, surname);
        while (true) {
            System.out.println("Set city name or press enter");
            sity = reader.readLine();
            if (sity.isEmpty()) {break;}
            System.out.println("Set surname or press enter");
            surname = reader.readLine();
            if (surname.isEmpty()) {break;}
            family.put(sity, surname);
        }
        System.out.println("Print city name to find surname");
        String lookForCity = reader.readLine();
        for (Map.Entry<String, String> map : family.entrySet()) {

            if (lookForCity.equals(map.getKey())){
                System.out.println(map.getValue());
            }
        }


    }
}
