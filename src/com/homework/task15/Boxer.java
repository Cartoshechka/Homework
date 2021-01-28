package com.homework.task15;

public class Boxer extends BodyGuard{
    @Override
    String applyMartialArts(Attacker attacker) {
        return "Saving client life using boxing skills";
    }

    @Override
    String applyMartialArts(AttackerRandom attackerRandom) {
        return "Saving client life using boxing skills";
    }
}
