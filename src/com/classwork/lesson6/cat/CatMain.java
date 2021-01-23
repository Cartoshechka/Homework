package com.classwork.lesson6.cat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class CatMain {

    public static void main(String[] args) throws IOException {

        ArrayList<Cat> cats = new ArrayList<>();

        Cat cat1 = new Cat("vasya");
        cats.add(cat1);

        cats.add(new Cat("petya"));
        cats.add(new Cat("myrka"));
        cats.add(new Cat("rygik"));
        cats.add(new Cat("tigrik"));

        System.out.println("Before: " + cats.toString());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

       // cannot to do because of ConcurrentModificationExeption
       /* for ( Cat cat : cats) {
            if (cat.name.equals(name)){
                cats.remove(cat);
            }
        }*/

        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()){
            Cat cat = catIterator.next();

            if (cat.name.equals(name)){
                catIterator.remove();
            }
        }

        //cats.removeIf(cat -> cat.name.equals(name));

        System.out.println("After: " + cats.toString());
    }
}
