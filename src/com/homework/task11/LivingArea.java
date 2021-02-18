package com.homework.task11;

public class LivingArea extends BaseProperty {

    double subsidies;

    public LivingArea(double tax, double square, double subsidies) {
        super(tax, square);
        this.subsidies = subsidies;
    }

    public double taxCalculation() {
        double calculationRes = super.taxCalculation();
        double res = calculationRes -(calculationRes / 100 * subsidies);
        return res;
    }


}
