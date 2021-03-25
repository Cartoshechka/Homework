package com.homework.task29;


public class Genre{
    String name;
    String description;

    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
