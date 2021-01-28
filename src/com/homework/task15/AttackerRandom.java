package com.homework.task15;

public class AttackerRandom {
    boolean gun;
    AttackerRandom(){
        this.gun = AttackerRandom.hasGun();
    }
    public static boolean hasGun() {
        return Math.random() < 0.5;
    }
}
