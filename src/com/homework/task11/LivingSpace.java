package com.homework.task11;

public class LivingSpace extends BaseProperty {

    double subsidii;

    public LivingSpace(double tax, double square, double subsidii) {
        super(tax, square);
        this.subsidii = subsidii;
    }

    public double taxCalculation() {
        double res = super.taxCalculation() -(super.taxCalculation() / 100 * subsidii);
        return res;
    }


}
