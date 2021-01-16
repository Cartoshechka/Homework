package com.company.Task13;

import java.io.IOException;

public class Farengeit extends Celsium implements Converter {


    public Farengeit() {
        super(0);
    }

    @Override
    public void convert() throws IOException {
        double celsium = super.Celsium();
        double res = (celsium * 9 / 5) + 32;
        System.out.println(res);

    }
}
