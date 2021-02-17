package com.homework.task11;

public class BaseProperty {
    private double square;
    private double tax;

    public BaseProperty(double tax, double square) {
        this.square = square;
        this.tax = tax;

    }
    public double taxCalculation() {
        double result = square * tax;
        return result;

    }


}
