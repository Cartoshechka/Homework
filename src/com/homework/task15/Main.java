package com.homework.task15;

public class Main {
    public static void main(String[] args) {

        Attacker attacker1 = new Attacker(true);
        Attacker attacker2 = new Attacker(false);
        Attacker attacker3 = new Attacker(true);
        AttackerRandom attacker4 = new AttackerRandom();
        AttackerRandom attacker5 = new AttackerRandom();
        AttackerRandom attacker6 = new AttackerRandom();
        BodyGuard jiujist = new Jiujist();
        System.out.println(jiujist.saveClientLife(attacker1));
        System.out.println(jiujist.saveClientLife(attacker4));
        BodyGuard karate = new Karate();
        System.out.println(karate.saveClientLife(attacker2));
        System.out.println(karate.saveClientLife(attacker5));
        BodyGuard boxer = new Boxer();
        System.out.println(boxer.saveClientLife(attacker3));
        System.out.println(boxer.saveClientLife(attacker6));



    }
}
