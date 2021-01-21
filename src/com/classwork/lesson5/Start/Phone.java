package com.classwork.lesson5.Start;

public class Phone extends AbstractPhone{


    public Phone(int year){
        super(year);
    }



    @Override
    public void call(String outputNumber) {
        System.out.println("Вращаем диск");
        System.out.println("Вызываем абонента по номеру " + outputNumber);
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Телефон звонит");
    }
}
