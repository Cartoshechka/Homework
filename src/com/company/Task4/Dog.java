package com.company.Task4;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private String breed;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getBreed(){
        return breed;
    }
    public int getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }


    public boolean equalsAge(Dog dog){
        return Objects.equals(age, dog.age);
    }
    public boolean equalsWeight(Dog dog){
        return Objects.equals(weight, dog.weight);
    }

}
