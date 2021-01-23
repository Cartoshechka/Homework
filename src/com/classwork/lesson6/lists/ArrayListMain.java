package com.classwork.lesson6.lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        // create array vs ArrayList
        String[] arrString = new String[10];
        ArrayList<String> arrayListStrings = new ArrayList<>();

        // fill array, ArrayList
        for (int i = 0; i < arrString.length; i++) {

            arrString[i] = "arr " + i;
            arrayListStrings.add(i, "arrlist " + i);

        }

        //get length
        System.out.println(arrString.length);
        System.out.println(arrayListStrings.size());

        //get element indexes
        System.out.println(arrString[3]);
        System.out.println(arrayListStrings.get(3));

        arrString[3] = "new arr " + 3;
        arrayListStrings.set(3, "new arrlist " + 3);

        System.out.println(arrString[3]);
        System.out.println(arrayListStrings.get(3));

        // arrString[10] = "add to the end"; cannot to do
        arrayListStrings.add("add to the end");

        System.out.println(arrayListStrings.get(10));

        System.out.println("size before add to the middle " + arrayListStrings.size());

        arrayListStrings.add(3, "add to the middle");

        System.out.println("Size after add to the middle" + arrayListStrings.size());

        for (String str : arrayListStrings) {
            System.out.println(str);

        }

        System.out.println("-------------------------------------");

        // arrString[0] = "add to the start"; cannot to do, because we override 0 element
        arrayListStrings.add(0, "add to the start");

        for (String str : arrayListStrings) {
            System.out.println(str);
        }

        System.out.println("------------------------- Remove in array --------------------");
        arrString[4] = null;

        for (String str : arrString) {
            System.out.println(str);
        }

        System.out.println("------------------------- Remove in arrayList --------------------");

        //remove by index
        arrayListStrings.remove(4);
        for (String str : arrayListStrings) {
            System.out.println(str);
        }
        //System.out.println(arraylistStrings.toString);

        // Array to List
        List<String> newList = Arrays.asList(arrString);
        System.out.println(newList.toString());

        // List to Array
        Object[] newArray = newList.toArray();
    }
}
