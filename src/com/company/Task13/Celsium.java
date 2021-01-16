package com.company.Task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Celsium {
    int cels;

    public Celsium(int cels) {
        this.cels = cels;
    }

    public double Celsium() throws IOException {
        System.out.println("Print degrees in celsium");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double cels = Integer.parseInt(bufferedReader.readLine());
        return cels;
    }




}
