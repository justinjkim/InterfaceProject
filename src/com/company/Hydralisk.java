package com.company;

public class Hydralisk extends Soldier {
    public Hydralisk (String name, String faction, int powerLevel, boolean isCommander) {
        super(name, "Zerg", 3, false);
    }

    public String speak() {
        return "Man, these spines on my back sure hurt...";
    }

    @Override
    public String toString() {
        return "My name is " +
                name + " and I serve the swarm of the " +
                faction + ".\n" +
                "Power Level: " +
                powerLevel + "\n" +
                "Is Commander? " + isCommander + "\n";
    }
}
