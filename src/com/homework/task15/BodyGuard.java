package com.homework.task15;

abstract class BodyGuard {
    abstract String applyMartialArts(Attacker attacker);
    abstract String applyMartialArts(AttackerRandom attacker);

    String shoot(Attacker attacker) {
        return "Shooting attacker";
    }

    String shoot(AttackerRandom attacker) {
        return "Shooting attacker";
    }

    String saveClientLife(Attacker attacker) {
        if (attacker.hasGun())
            return shoot(attacker);
        else
            return applyMartialArts(attacker);

    }

    public String saveClientLife(AttackerRandom attacker) {
        if (AttackerRandom.hasGun())
            return shoot(attacker);
        else
            return applyMartialArts(attacker);

    }
}
