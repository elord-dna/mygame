package com.game_attacker.impl;

import java.util.List;

import com.game_attacker.Attacker;
import com.game_base.base.FightRole;

public class NormalAttacker extends Attacker {

    @Override
    public void attack(List<FightRole> roles) {
        System.err.println("normal attack");
    }

}
