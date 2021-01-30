package com.homework.task11;

public class TaxConstructor {
    private double square;
    private double tax;

    public TaxConstructor(double tax, double square) {
        this.square = square;
        this.tax = tax;

    }
    public double TaxCalculator() {
        double result = square * tax;
        return result;

    }


}
