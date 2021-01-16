package com.company.Task11;

public class Torgovaya extends Calc{

    public Torgovaya(int tax, int square, int viruchka) {
        super(square,tax);
        if (viruchka > 100){
            System.out.println("Налог составляет: " + super.Calc(square,tax));

        }else {
            System.out.println("Вы заработали меньше 100 грн поетому налог с вас не взыимается");
        }

    }


}
