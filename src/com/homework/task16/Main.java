package com.homework.task16;

public class Main {
    public static void main(String[] args) {
        MyStringArrayList arrList = new MyStringArrayList();

        arrList.add("petr0");
        arrList.add("petr1");
        arrList.add("petr2");
        arrList.add("petr3");
        arrList.add("petr4");
        arrList.getString(arrList);
        System.out.println("--------------------------");
        arrList.set(0,"petr ne 0");
        arrList.getString(arrList);
        System.out.println("--------------------------");
        arrList.add(6,"petr6");
        arrList.getString(arrList);
        System.out.println("--------------------------");
        arrList.remove(5);
        arrList.getString(arrList);
        System.out.println("--------------------------");
        arrList.add(8,"petr8");
        arrList.getString(arrList);



    }
}
