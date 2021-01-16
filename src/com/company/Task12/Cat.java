package com.company.Task12;

public class Cat implements Climb, Run {
    @Override
    public void climb() {
        System.out.println("Cat can climb");
    }

    @Override
    public void run() {
        System.out.println("Cat can run");
    }
}
