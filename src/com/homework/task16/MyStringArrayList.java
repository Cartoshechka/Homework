package com.homework.task16;


import com.homework.task17.MyLinkedList;

import java.util.Iterator;

public class MyStringArrayList {
    private static final int INIT_SIZE = 16;
    private static Object[] array = new Object[INIT_SIZE];
    private static int numOfBlocks = 0;

    public void add(Object item) {
        if (numOfBlocks == array.length - 1)
            resize(array.length + 10);
        array[numOfBlocks++] = item;
    }


    public void add(int index, String string) {
        final int s;
        Object[] elementData;
        if ((s = numOfBlocks) == (elementData = this.array).length)
            resize(array.length+10);
        System.arraycopy(elementData, index,
                elementData, index + 1,
                s - index);
        elementData[index] = string;
        numOfBlocks++;
    }


    public void set(int index, Object item) {

        array[index] = item;
    }


    public static String get(int index) {
        return (String) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < numOfBlocks; i++)
            array[i] = array[i + 1];
        array[numOfBlocks] = null;
        numOfBlocks--;
    }

    public static int size() {
        return numOfBlocks;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, numOfBlocks);
        array = newArray;
    }




    public String toString() {
        String res = "Содержание списка: ";
        for (int i = 0; i < MyStringArrayList.size(); i++) {
            res += " " + MyStringArrayList.get(i) + ',' ;
        }
        return res;
    }
}
