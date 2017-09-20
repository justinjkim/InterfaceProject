package com.company;

public interface MeleeAttack {
    public String meleeAttack();

    default String punch() {
        return "My fists are the only weapons I need.";
    }
}
