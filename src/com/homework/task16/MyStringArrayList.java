package com.homework.task16;


public class MyStringArrayList {
    private static final int INIT_SIZE = 16;
    private static Object[] array = new Object[INIT_SIZE];
    private int numOfBlocks = 0;

    public void add(Object item) {
        if(numOfBlocks == array.length-1)
            resize(array.length+1);
        array[numOfBlocks++] = item;
    }


    public void add(int index, Object item) {
        for (int i = numOfBlocks; i < index; i++) {
            numOfBlocks++;
        }
        if (numOfBlocks >=  index){
            array[numOfBlocks++] = item;
        }
       }


    public void set(int index,Object item) {

        array[index] = item;
    }


    public static String get(int index) {
        return (String) array[index];
    }

    public void remove(int index) {
        for (int i = index; i< numOfBlocks; i++)
            array[i] = array[i+1];
        array[numOfBlocks] = null;
        numOfBlocks--;
    }

    public int size() {
        return numOfBlocks;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, numOfBlocks);
        array = newArray;
    }


    public void getString(MyStringArrayList myStringArrayList) {
        System.out.println("Содержимое списка ");
        for (int i = 0; i < myStringArrayList.size(); i++) {
            System.out.println(i +": " + myStringArrayList.get(i));
        }
    }
}
