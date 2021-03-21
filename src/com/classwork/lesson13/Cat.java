package com.classwork.lesson13;

import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final Integer age;
    private final Integer weight;
    transient private Integer lifeNumbers;


    public Cat(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", lifeNumbers=" + lifeNumbers +
                '}';
    }
}
