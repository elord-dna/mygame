package com.game_attacker;

import java.util.List;

import com.game_attacker.impl.NormalAttacker;
import com.game_base.base.FightRole;

public class Attacker {

    private AttackType type;
    private Attacker attacker;
    
    public Attacker() {
        this(AttackType.NORMAL);
        attacker = new NormalAttacker();
    }
    public Attacker(AttackType type) {
        this.type = type;
    }
    
    public void attack(List<FightRole> roles) {
        attacker.attack(roles);
    }
    public AttackType getType() {
        return type;
    }
    public void setType(AttackType type) {
        this.type = type;
    }
}
