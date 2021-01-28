package com.homework.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Mn {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Asdadad");
        arrayList.add("Asdadad");
        arrayList.add("Asdadad");
        arrayList.add("Asdadad");
        arrayList.add("Asdadad");
        arrayList.add("Asdadad");
        arrayList.add("Asdadad");
        arrayList.add("Asdadad");
        arrayList.add("Asdadad");
        arrayList.add("Asdadad");

        arrayList.add(1,"aaaaaaaaaaa");
        System.out.println(arrayList.toString());
        arrayList.add(11,"bbbbbbbbbbbbbbb");
        System.out.println(arrayList.toString());

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);

        linkedList.get(2);
        System.out.println(linkedList.toString());


    }
}
