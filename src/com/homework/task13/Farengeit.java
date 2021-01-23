package com.homework.task13;

import java.io.IOException;

public class Farengeit extends Celsium implements Converter {


    public void convert() throws IOException {
        double celsium = super.Celsium();
        double res = (celsium * 9 / 5) + 32;
        System.out.println(res);

    }
}
