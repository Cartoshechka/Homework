package com.homework.task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Print degrees in celsium");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double celsium = Double.parseDouble(reader.readLine());
        System.out.println("Print in whitch you want to convert your degrees from celsium to (calvin or farengeit)");
        BufferedReader calvinOrFarengeit = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = calvinOrFarengeit.readLine()).equals("")) {
            switch (input) {
                case "calvin":
                    System.out.println(Convert.calvin(celsium));
                    break;
                case "farengeit":
                    System.out.println(Convert.farengeit(celsium));
                    break;
                default:
                    System.out.println("Invalid input");


            }

        }
    }
}



