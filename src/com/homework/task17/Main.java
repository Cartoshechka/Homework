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
        System.out.println(linkedList.print());
        System.out.println("--------------------------------------");
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.get(3));
        linkedList.remove(3);
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.print());
        System.out.println("----------------------------------------------------------");
        System.out.println(linkedList.getSize());
        linkedList.addFirst(3);
        linkedList.set(1,3);
        linkedList.add(3,228);
        System.out.println(linkedList.print());






    }
}
