package com.classwork.lesson13;

import java.io.*;

import static com.classwork.lesson13.FileUtils.readFromFile;
import static com.classwork.lesson13.FileUtils.writeToFile;

public class CatSerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Vasiliy", 4, 3);
        writeToFile(cat, "cat.dat");

        Cat cat1 = (Cat) readFromFile("cat.dat");
        System.out.println(cat1);
    }
}
