package com.homework.task11;

public class TradingArea extends BaseProperty {

    double viruchka;
    public TradingArea(double tax, double square, double viruchka) {
        super(square,tax);
        this.viruchka = viruchka;

    }

    @Override
    public double taxCalculation() {
        if (viruchka < 100) {
            return 0;

        } else {
            double res = super.taxCalculation();
            return res;
        }
    }
}
