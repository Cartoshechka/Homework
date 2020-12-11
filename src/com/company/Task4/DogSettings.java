package com.company.Task4;

public class DogSettings {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Rex");
        dog1.setAge(7);
        dog1.setBreed("bull terrier");
        dog1.setWeight(25);
        printDog(dog1);
        Dog dog2 = new Dog();
        dog2.setName("Tuzik");
        dog2.setAge(7);
        dog2.setBreed("staffordshire terrier");
        dog2.setWeight(25);
        printDog(dog2);

        if (dog1.equals(dog2)){
            System.out.println("equals in weight and age");
        } else {
            System.out.println("not equals in weight and age");
        }



    }

    public static void printDog(Dog dog){
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Weight: " + dog.getWeight());
    }

}

