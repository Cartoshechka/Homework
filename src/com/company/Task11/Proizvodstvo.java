package com.company.Task11;

public class Proizvodstvo extends Calc{


    public Proizvodstvo(int tax, int square) {
        super(tax, square);
        System.out.println("Налог на ваше производство составляет: " + super.Calc(tax, square));
    }
}
