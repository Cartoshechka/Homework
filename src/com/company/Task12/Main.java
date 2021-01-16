package com.company.Task12;

import com.classwork.lesson5.End.*;
import com.classwork.lesson5.End.Runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = bufferedReader.readLine()).equals("")) {
            Object object = null;

            switch (input) {
                case "cat":
                    object = new Cat();
                    break;
                case "duck":
                    object = new Duck();
                    break;
                case "tiger":
                    object = new Tiger();
                    break;
                case "dog":
                    object = new Dog();
                    break;
                default:
                    System.out.println("Invalid input");


            }
            if (object instanceof Fly) {

                ((Fly) object).fly();

            }
            if (object instanceof Run) {

                ((Run) object).run();

            }
            if (object instanceof Climb){
                ((Climb) object).climb();
            }


        }


    }
}

