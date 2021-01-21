package com.classwork.lesson5.Start;

public class ThomasEdisonPhone extends AbstractPhone{
    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
        System.out.println("Мы набираем абонента номер " + outputNumber);
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Телефон звонит");
        System.out.println("Вам звонит абонент под номером " + inputNumber);
    }


}
