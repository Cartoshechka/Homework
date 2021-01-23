package com.classwork.lesson6.lists;

import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            strings.add("string " + i);
        }

        //System.out.println(strings.toString());
        System.out.println(strings);

        System.out.println(strings.get(5));

        strings.add(5, "new string");
        System.out.println(strings);

        strings.addFirst("new first");
        strings.addLast("new last");
        System.out.println(strings);
    }

}
