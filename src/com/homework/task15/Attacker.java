package com.homework.task15;

public class Attacker {

    boolean gun;
    Attacker(boolean hasGun){
        this.gun = hasGun;
    }

    public boolean hasGun() {
        if(this.gun == true){
            return true;
        }else {
            return false;
        }
    }
}
