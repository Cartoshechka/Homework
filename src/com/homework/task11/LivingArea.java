package com.homework.task11;

public class LivingArea extends BaseProperty {

    double subsidies;

    public LivingArea(double tax, double square, double subsidies) {
        super(tax, square);
        this.subsidies = subsidies;
    }

    public double taxCalculation() {
        double res = super.taxCalculation() -(super.taxCalculation() / 100 * subsidies);
        return res;
    }


}
