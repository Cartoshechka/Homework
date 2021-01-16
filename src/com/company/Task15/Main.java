package com.company.Task15;

public class Main {
    public static void main(String[] args) {

        Attacker attacker = new Attacker(false);
        Attacker attacker1 = new Attacker(true);
        BodyGuard jiujist = new Jiujist();
        System.out.println(jiujist.saveClientLife(attacker));
        BodyGuard karate = new Karate();
        System.out.println(karate.saveClientLife(attacker));
        BodyGuard boxer = new Boxer();
        System.out.println(boxer.saveClientLife(attacker1));



    }
}
