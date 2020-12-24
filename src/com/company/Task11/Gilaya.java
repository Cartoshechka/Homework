package com.company.Task11;

public class Gilaya {


    public Gilaya(int tax, int square, int subsidii) {
        int res = tax * square;
        int subs = res / 100 * subsidii;
        int res2 = res - subs;
        System.out.println("Налог с учётом субсидий составляет: " + res2);




    }


}
