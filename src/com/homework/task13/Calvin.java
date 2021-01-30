package com.homework.task13;

public class Calvin implements Convert {

    @Override
    public double converts(double cels) {
        double res = cels + 273.15;

        return res;
    }
}
