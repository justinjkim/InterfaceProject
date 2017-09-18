package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Marine Jack = new Marine("Jack", "Terran", 1, false);
        System.out.println(Jack);
        System.out.println(Jack.speak());

        Hydralisk Groucho = new Hydralisk("Groucho", "Zerg", 3, false);
        System.out.println(Groucho);
        System.out.println(Groucho.speak());

        Archon Buzby = new Archon("Buzby", "Protoss", 5, true);
        System.out.println(Buzby);
        System.out.println(Buzby.speak());
    }
}
