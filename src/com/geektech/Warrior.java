package com.geektech;

public class Warrior extends Hero{
    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior used " + superAbilityType;
    }
}
