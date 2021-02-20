package com.homework.task15;

public class AttackerRandom {
    boolean hasGun;

    AttackerRandom() {
        this.hasGun = AttackerRandom.hasGun();
    }

    public static boolean hasGun() {
        return Math.random() < 0.5;
    }
}
