package com.homework.task15;

abstract class BodyGuard {
    abstract String applyMartialArts(Attacker attacker);

    String shoot(Attacker attacker) {
        return "Shooting attacker";
    }

    String saveClientLife(Attacker attacker) {
        if (attacker.hasGun())
           return shoot(attacker);
        else
          return applyMartialArts(attacker);

    }


}
