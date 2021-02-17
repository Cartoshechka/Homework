package com.homework.task11;

public class TradingArea extends BaseProperty {

    double proceeds;
    public TradingArea(double tax, double square, double proceeds) {
        super(square,tax);
        this.proceeds = proceeds;

    }

    @Override
    public double taxCalculation() {
        if (proceeds < 100) {
            return 0;

        } else {
            double res = super.taxCalculation();
            return res;
        }
    }
}
