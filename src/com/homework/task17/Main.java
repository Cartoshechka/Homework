package com.homework.task17;

public class Main {
    public static void main(String[] args) {


        MyLinkedList linkedList = new MyLinkedList();

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
        linkedList.add(3, 1);
        System.out.println(linkedList.print());
        System.out.println(linkedList.getSize());
        linkedList.remove(1);
        System.out.println(linkedList.print());
        System.out.println(linkedList.getSize());



    }
}
