package com.homework.task11;

public class Torgovaya extends TaxConstructor {

    double viruchka;
    public Torgovaya(double tax, double square, double viruchka) {
        super(square,tax);
        this.viruchka = viruchka;

    }

    @Override
    public double TaxCalculator() {
        if (viruchka < 100) {
            return 0;

        } else {
            double res = super.TaxCalculator();
            return res;
        }
    }
}
