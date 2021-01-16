package com.company.Task11;

public class Gilaya extends Calc{

    int subsidii;

    public Gilaya(int tax, int square, int subsidii) {
        super(tax, square);
        int res = super.Calc(tax,square)-(super.Calc(tax,square) / 100 * subsidii);
        System.out.println("Налог на вашу жилую площядь с учётом ваших субсидий составляет: " + res);

    }



}
