package com.company.Task15;

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
