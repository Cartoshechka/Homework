package com.homework.task15;

public class Attacker {

    boolean gun;
    Attacker(boolean gun){
        this.gun = gun;
    }

    public boolean hasGun() {
        if(this.gun == true){
            return true;
        }else {
            return false;
        }
    }
}
