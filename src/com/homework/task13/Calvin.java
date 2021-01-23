package com.homework.task13;

import java.io.IOException;

public class Calvin extends Celsium implements Converter {


    public void convert() throws IOException {
        double cels = super.Celsium();
        double res = cels + 273.15;
        System.out.println(res);
    }
}
