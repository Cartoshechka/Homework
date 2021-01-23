package com.homework.task12;

public class Tiger implements Run, Climb {

    @Override
    public void climb() {
        System.out.println("Tiger can climb");
    }

    @Override
    public void run() {
        System.out.println("Tiger can run");

    }
}
