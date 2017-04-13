package com.game_attacker;

public class AttackerFactory {

    public static Attacker getAttacker() {
        return new Attacker();
    }
    public static Attacker getAttacker(AttackType type) {
        return new Attacker(type);
    }
}
