package com.homework.task11;

public class Torgovaya extends Constructor {

    int viruchka;
    public Torgovaya(int tax, int square, int viruchka) {
        super(square,tax);
        this.viruchka = viruchka;
        if (viruchka > 100 || viruchka == 100){
            System.out.println("Налог составляет: " + tax * square);

        }else {
            System.out.println("Вы заработали меньше 100 грн поетому налог с вас не взыимается");
        }

    }


}
