package com.company;

public class Marine extends Soldier {

    public Marine (String name, String faction, int powerLevel, boolean isCommander) {
        super(name, "Terran", 1, false);
    }

    public String speak() {
        return "Jacked up and good to go!";
    }

    @Override
    public String toString() {
        return "My name is " +
                name + ", and I'm proud to serve my " +
                faction + " race.\n" + "Power Level: " +
                powerLevel + "\nIs Commander? " +
                isCommander + "\n";
    }
}
