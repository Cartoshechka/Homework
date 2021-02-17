package com.homework.task11;


public class Main {

    public static void main(String[] args) {
        BaseProperty gilaya = new LivingSpace(20.7, 100.25, 10);
        BaseProperty torgovaya = new TradingArea(750.4, 5.80, 100);
        BaseProperty proizvodstvo = new ProductionArea(4559.75, 54.84);

        System.out.println("Налог на жил площадь -> " + gilaya.taxCalculation());
        System.out.println("Налог на тогр площадь -> " + torgovaya.taxCalculation());
        System.out.println("Налог на производственную площадь -> " + proizvodstvo.taxCalculation());

    }
}