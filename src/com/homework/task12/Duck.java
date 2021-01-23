package com.homework.task12;

public class Duck implements Fly, Run {

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void run() {
        System.out.println("Duck can run");
    }

}
