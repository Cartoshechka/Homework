package com.homework.task20;

import java.util.HashSet;
import java.util.Set;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int i = 1; i <= 4; i++) {
            Cat cat = new Cat("Berkley №" + i);
            result.add(cat);
        }
        return result;
    }
}
