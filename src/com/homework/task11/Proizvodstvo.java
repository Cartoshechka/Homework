package com.homework.task11;

public class Proizvodstvo extends Constructor {


    public Proizvodstvo(int tax, int square) {
        super(tax, square);
        int res = tax * square;
        System.out.println("Налог на производство составляет: " + res);

    }
}
