package com.classwork.lesson6.cat;

public class Cat {

    String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
