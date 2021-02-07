package com.homework.task20;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static com.homework.task20.Cat.createCats;
import static com.homework.task20.Dog.createDogs;

public class Main {
    public static void main(String[] args) {
        Set<Cat> catSet = createCats();
        Set<Dog> dogSet = createDogs();

        Set<Object> allAnimals = join(catSet, dogSet);

        printPets(Collections.singleton(catSet));
        printPets(Collections.singleton(dogSet));
        printPets(Collections.singleton(allAnimals));

        removeCats(allAnimals, catSet);
        /*removeDogs(allAnimals,dogSet);*/
        printPets(Collections.singleton(allAnimals));
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    /* public static void removeDogs(Set<Object> pets, Set<Dog> dogs) {
         pets.removeAll(dogs);
     }*/
    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
        System.out.println("--------------------------------------------------------------------");
    }
}
