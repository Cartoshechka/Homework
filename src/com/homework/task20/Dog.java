package com.homework.task20;

import java.util.HashSet;
import java.util.Set;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();
        for (int i = 1; i <= 3; i++) {
            Dog dog = new Dog("Tuzik №" + i);
            result.add(dog);
        }
        return result;
    }
}
