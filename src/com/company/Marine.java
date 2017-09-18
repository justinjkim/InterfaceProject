package com.company;

public class Marine extends Soldier {
    String name;

    public Marine (String name) {
        super(name, "Terran", 1, false);
    }

    public String speak() {
        return "Jacked up and good to go!";
    }
}
