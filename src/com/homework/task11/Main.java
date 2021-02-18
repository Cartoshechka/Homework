package com.homework.task11;


public class Main {

    public static void main(String[] args) {
        BaseProperty livingArea = new LivingArea(20.7, 100.25, 10);
        BaseProperty tradingArea = new TradingArea(750.4, 5.80, 100);
        BaseProperty productionArea = new ProductionArea(4559.75, 54.84);

        System.out.println("Налог на жил площадь -> " + livingArea.taxCalculation());
        System.out.println("Налог на тогр площадь -> " + tradingArea.taxCalculation());
        System.out.println("Налог на производственную площадь -> " + productionArea.taxCalculation());

    }
}