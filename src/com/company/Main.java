package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Marine Jack = new Marine("Jack", "Terran", 1, false);
        System.out.println(Jack);
        System.out.println(Jack.speak());
        System.out.println(Jack.meleeAttack());
        System.out.println(Jack.projectileAttack());
        System.out.println(Jack.kamikazeAttack());

        Hydralisk Groucho = new Hydralisk("Groucho", "Zerg", 3, false);
        System.out.println(Groucho);
        System.out.println(Groucho.speak());
        System.out.println(Groucho.meleeAttack());
        System.out.println(Groucho.projectileAttack());
        System.out.println(Groucho.kamikazeAttack());

        Archon Buzby = new Archon("Buzby", "Protoss", 5, true);
        System.out.println(Buzby);
        System.out.println(Buzby.speak());
        System.out.println(Buzby.meleeAttack());
        System.out.println(Buzby.projectileAttack());
        System.out.println(Buzby.kamikazeAttack());
    }
}
