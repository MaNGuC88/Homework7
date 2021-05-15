package com.geektech;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        HavingSuperAbility[] heroes = {magic, medic, warrior};
        for (HavingSuperAbility hero : heroes) {
            System.out.println(hero.applySuperAbility("Fatality"));
        }
    }
}
