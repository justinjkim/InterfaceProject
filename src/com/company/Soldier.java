package com.company;

public abstract class Soldier {
    String name;
    String rank;
    int serialNumber;
    boolean isBoss;

    public String taunt(String s) {
        return s;
    }

    public String sleep() {
        return "Zzz...";
    }

    public String eat() {
        return "Nom nom";
    }

    public abstract String speak(); // as of writing this line, looks like compiler complains that it should NOT have a body, so leaving alone...
}
