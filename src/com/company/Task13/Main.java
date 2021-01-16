package com.company.Task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        System.out.println("Print in whitch you want to convert your degrees from celsium to (Calvin or Farengeit)");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = bufferedReader.readLine()).equals("")) {
            double res;
            switch (input) {
                case "calvin":
                   Calvin calvin = new Calvin();
                   calvin.convert();
                    break;
                case "farengeit":
                   Farengeit farengeit = new Farengeit();
                   farengeit.convert();
                    break;
                default:
                    System.out.println("Invalid input");


            }


        }


    }

    }



