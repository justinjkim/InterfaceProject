package com.company;

public class Hydralisk extends Soldier {
    public Hydralisk (String name, String faction, int powerLevel, boolean isCommander) {
        super(name, "Zerg", 3, false);
    }

    public String speak() {
        return "Man, these spines on my back sure hurt...";
    }

    public String projectileAttack() {
        return "Hah! My spines go further than you think.";
    }

    public String meleeAttack() {
        return "What are these slashy things on my arms? Guess I'll use it against you...Kerrigan's orders.";
    }

    public String kamikazeAttack() {
        return "Well, at least I'll probably get hatched as a drone or something.";
    }

    @Override
    public String toString() {
        return "My name is " +
                name + " and I serve the swarm of the " +
                faction + ".\n" +
                "Power Level: " +
                powerLevel + "\n" +
                "Is Commander? " +
                isCommander;
    }
}
