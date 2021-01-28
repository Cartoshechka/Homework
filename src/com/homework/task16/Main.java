package com.homework.task16;

public class Main {
    public static void main(String[] args) {
        MyStringArrayList arrList = new MyStringArrayList();

        arrList.add("petr0");
        arrList.add("petr1");
        arrList.add("petr2");
        arrList.add("petr3");
        arrList.add("petr4");
        System.out.println(arrList.toString());
        System.out.println("--------------------------");
        arrList.set(0,"petr ne 0");
        System.out.println(arrList.toString());
        System.out.println("--------------------------");
        arrList.add(1,"petr6");
        System.out.println(arrList.toString());
        System.out.println("--------------------------");
        arrList.add(4,"petr8");
        System.out.println(arrList.toString());
        System.out.println("--------------------------");
        arrList.add(2, "petr ne 3");
        System.out.println(arrList.toString());
        System.out.println("--------------------------");
        arrList.add(8,"petr88");
        System.out.println(arrList.toString());


    }
}
