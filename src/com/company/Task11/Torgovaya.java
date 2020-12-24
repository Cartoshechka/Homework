package com.company.Task11;

public class Torgovaya extends Proizvodstvo{

    private int viruchka;

    public void Calculate(int square, int viruchka, int tax){

        if (viruchka > 100){
        int res = square * tax;}else {
            System.out.println("С вас не берётся налог изза маленькой прибыли");
        }



    }
}
