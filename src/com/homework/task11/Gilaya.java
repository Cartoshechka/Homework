package com.homework.task11;

public class Gilaya extends TaxConstructor {

    double subsidii;

    public Gilaya(double tax, double square, double subsidii) {
        super(tax, square);
        this.subsidii = subsidii;
    }

    public double TaxCalculator() {
        double res = super.TaxCalculator() -(super.TaxCalculator() / 100 * subsidii);
        return res;
    }


}
