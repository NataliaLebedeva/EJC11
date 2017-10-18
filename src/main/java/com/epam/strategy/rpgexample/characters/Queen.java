package com.epam.strategy.rpgexample.characters;

import com.epam.strategy.rpgexample.weapon.DaggerBehaviour;

public class Queen extends Character {
    public Queen() {
        name = "Queen";
        weaponBehaviour = new DaggerBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("Sneaking to enemy's back...");
        weaponBehaviour.useWeapon();
    }
}
