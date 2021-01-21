package com.classwork.lesson5.End;

public class Duck implements Flyable, Runnable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flys");
    }

    @Override
    public void run() {
        System.out.println("Duck runs");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
