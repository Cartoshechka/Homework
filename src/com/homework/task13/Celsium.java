package com.homework.task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Celsium {
    double cels;

    public double Celsium() throws IOException {
        System.out.println("Print degrees in celsium");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         this.cels = Integer.parseInt(bufferedReader.readLine());
        return cels;
    }




}
