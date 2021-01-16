package com.company.Task12;

public class Dog implements Run, Climb {
    @Override
    public void climb() {
        System.out.println("Dog can climb");
    }

    @Override
    public void run() {
        System.out.println("Dog can run");

    }
}
