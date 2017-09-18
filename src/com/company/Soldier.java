package com.company;

public abstract class Soldier implements ProjectileAttack, MeleeAttack, KamikazeAttack {
    String name;
    String faction;
    int powerLevel;
    boolean isCommander;

    public Soldier (String name, String faction, int powerLevel, boolean isCommander) {
        this.name = name;
        this.faction = faction;
        this.powerLevel = powerLevel;
        this.isCommander = false;
    }


    public String taunt(String s) {
        return s;
    }

    public String sleep() {
        return "Zzz...";
    }

    public String eat() {
        return "We need better rations...";
    }

    public abstract String speak(); // as of writing this line, looks like compiler complains that it should NOT have a body, so leaving alone...


}
