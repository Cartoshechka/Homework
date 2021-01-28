package com.homework.task17;

public class MyLinkedList {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    Node head;
    int size;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            size += 1;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        size += 1;
    }


    public int getSize() {
        return size;
    }

    /*public Node  getData(int index){
        if (index > getSize()) {
            System.out.println("Incorrect index");
        }

        if (index == 0) {
            return head;
        } while (index < getSize()){

            if ()


        }

        return null;
    }*/
   /* public String  get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }*/
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            System.out.println("Out of Bound");
    }
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    public void add(int data, int index) {

        if (index > getSize()) {
            return;
        }

        Node current = head;
        int pos = 0;
        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size += 1;
            return;
        }
        while (current.next != null) {
            if (pos == index - 1) {
                break;
            }
            pos++;
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size += 1;

    }
    public void set(int index, int data){
        if (index > getSize()) {
            return;
        }

        Node current = head;
        int pos = 0;
        Node newNode = new Node(data);

       findByIndex(index);
    }

    public boolean remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node node = findNodeBeforeByIndex(index);
            Node tmp = findByIndex(index);
            node.next = tmp.next;
        }
        size--;
        return false;
    }




    private Node findByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int tmpIndex = 0;
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return head;
        }

        Node node = head;
        while (node.next != null) {
            node = node.next;
            tmpIndex++;
            if (tmpIndex == index) {
                return node;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    private Node findNodeBefore(int value) {
        if (head.data == value) {
            return new Node(value);
        }

        Node node = head;
        while (node.next != null) {
            if (node.next.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private Node findNodeBeforeByIndex(int index) {
        if (index <= 0 || index > size - 1) {
            return null;
        }

        int count = 0;
        Node node = head;
        while (node.next != null) {
            if (count == index - 1) {
                return node;
            }
            count++;
            node = node.next;
        }
        return null;
    }


        public String print(){

            if (getSize() == 0) {
                return null;
            }
            Node current = head;
            while (current.next != null) {
                System.out.print(current.data + "; ");
                current = current.next;
            }

            return current.data + "\n";
        }
    }



