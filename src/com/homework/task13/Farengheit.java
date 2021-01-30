package com.homework.task13;

public class Farengheit implements Convert {

    @Override
    public double converts(double cels) {
        double res = (cels * 9 / 5) + 32;
        return res;
    }
}
