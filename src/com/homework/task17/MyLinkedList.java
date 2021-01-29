package com.homework.task17;

import java.util.LinkedList;

public class MyLinkedList {

    private static class Node {
        int item;
        Node next;
        Node prev;

        Node(Node prev, int element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    Node last;
    protected transient int modCount = 0;
    Node first;
    int size;
    Node node(int index) {

        if (index < (size >> 1)) {
            Node x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
    public int get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }
    public int set(int index, int item) {
        checkElementIndex(index);
        Node x = node(index);
        int oldVal = x.item;
        x.item = item;
        return oldVal;
    }
    public int remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }
    public int add(int item) {
        linkLast(item);
        return 1;
    }
    public void addFirst(int item) {
        linkFirst(item);
    }
    public void add(int index, int item) {
        checkPositionIndex(index);

        if (index == size)
            linkLast(item);
        else
            linkBefore(item, node(index));
    }
    public String print(){

        if (getSize() == 0) {
            return null;
        }
        Node current = first;
        while (current.next != null) {
            System.out.print(current.item + "; ");
            current = current.next;
        }

        return current.item + "\n";
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException("Incorre index -> "+ index);
    }
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private void linkLast(int item) {
        final Node last = this.last;
        final Node newNode = new Node(last, item, null);
        this.last = newNode;
        if (last == null)
            first = newNode;
        else
            last.next = newNode;
        size++;
        modCount++;
    }

    void linkBefore(int item, Node bf) {
        final Node bef = bf.prev;
        final Node newNode = new Node(bef, item, bf);
        bf.prev = newNode;
        if (bef == null)
            first = newNode;
        else
            bef.next = newNode;
        size++;
        modCount++;
    }
    private void linkFirst(int item) {
        final Node f = first;
        final Node newNode = new Node(null, item, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
    }



    public int getSize() {
        return size;
    }
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            System.out.println("Out of Bound ->" + index);
    }
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private int unlink(Node x) {
        final int element = x.item;
        final Node next = x.next;
        final Node prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = 0;
        size--;
        modCount++;
        return element;
    }



    }



