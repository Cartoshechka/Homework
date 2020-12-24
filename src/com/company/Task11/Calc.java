package com.company.Task11;

public class Calc {

    private int tax;
    private int square;
    private int res;

    public Calc(int tax, int square){
        this.tax = tax;
        this.square = square;
        this.res = tax * square;
        System.out.println(this.res);
    }


}
