package com.company.Task11;

public class Torgovaya{

    public Torgovaya(int tax, int square, int viruchka) {
        if (viruchka > 100){
            System.out.println("Налог составляет: " + (square *tax));

        }else {
            System.out.println("Вы заработали меньше 100 грн поетому налог с вас не взыимается");
        }

    }


}
