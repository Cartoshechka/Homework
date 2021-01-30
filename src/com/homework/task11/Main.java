package com.homework.task11;


public class Main {

    public static void main(String[] args) {
        TaxConstructor gilaya = new Gilaya(20.7, 100.25, 10);
        TaxConstructor torgovaya = new Torgovaya(750.4, 5.80, 100);
        TaxConstructor proizvodstvo = new Proizvodstvo(4559.75, 54.84);

        System.out.println("Налог на жил площадь -> " + gilaya.TaxCalculator());
        System.out.println("Налог на тогр площадь -> " + torgovaya.TaxCalculator());
        System.out.println("Налог на производственную площадь -> " + proizvodstvo.TaxCalculator());

    }
}