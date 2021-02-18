package com.homework.task11;

public class LivingArea extends BaseProperty {

    double subsidies;

    public LivingArea(double tax, double square, double subsidies) {
        super(tax, square);
        this.subsidies = subsidies;
    }

    public double taxCalculation() {
        double a = super.taxCalculation();
        double res = a -(a / 100 * subsidies);
        return res;
    }


}
