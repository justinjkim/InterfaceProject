package com.company;

public class Archon extends Soldier implements ProjectileAttack, MeleeAttack, KamikazeAttack {
    public Archon (String name, String faction, int powerLevel, boolean isCommander) {
        super(name, "Protoss", 5, true);
    }

    public String speak() {
        return "POWER OVERWHELMING!!";
    }

    @Override
    public String kamikazeAttack() {
        return "My life for Aiur!";
    }

    public String projectileAttack() {
        return "Using psionic waves against the enemy...";
    }

    public String meleeAttack() {
        return "My hands are too powerful for you...";
    }

    @Override
    public String punch() {
        return "Well, this is awkward...I forgot I don't really have hands, only psionic wave blasts.";
    }

    @Override
    public String toString() {
        return "My name is " +
                name + " and I will give my life for the " +
                faction + ".\n" +
                "Power Level: " +
                powerLevel + "\n" +
                "Is Commander? " +
                isCommander;
    }
}
