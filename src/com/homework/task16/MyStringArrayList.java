package com.homework.task16;


public class MyStringArrayList {
    private  final int INIT_SIZE = 16;
    private  Object[] array = new Object[INIT_SIZE];
    private  int numOfBlocks = 0;

    public void add(String item) {
        if (numOfBlocks == array.length - 1)
            resize(array.length*2);
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


    public void set(int index, String item) {

        array[index] = item;
    }


    public String get(int index) {
        return (String) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < numOfBlocks; i++)
            array[i] = array[i + 1];
        array[numOfBlocks] = null;
        numOfBlocks--;
    }

    public  int size() {
        return numOfBlocks;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, numOfBlocks);
        array = newArray;
    }




    public String toString() {
        String res = "Содержание списка: ";
        for (int i = 0; i < size(); i++) {
            res += " " + get(i) + ';' ;
        }
        return res;
    }
}
