package com.homework.task15;

abstract class BodyGuard {
    abstract String applyMartialArts(Attacker attacker);
    abstract String applyMartialArts(AttackerRandom attackerRandom);

    String shoot(Attacker attacker) {
        return "Shooting attacker";
    }
    String shoot(AttackerRandom attackerRandom) {
        return "Shooting attacker";
    }

    String saveClientLife(Attacker attacker) {
        if (attacker.hasGun())
           return shoot(attacker);
        else
          return applyMartialArts(attacker);

    }
    String saveClientLife(AttackerRandom attackerRandom) {
        if (attackerRandom.hasGun())
            return shoot(attackerRandom);
        else
            return applyMartialArts(attackerRandom);

    }


}
