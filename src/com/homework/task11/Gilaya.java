package com.homework.task11;

public class Gilaya extends Constructor {

    int subsidii;

    public Gilaya(int tax, int square, int subsidii) {
        super(tax, square);
        this.subsidii = subsidii;
        int res = tax * square -(tax * square / 100 * subsidii);

        System.out.println("Налог на жил площадь составляет: " + res);
    }




}
