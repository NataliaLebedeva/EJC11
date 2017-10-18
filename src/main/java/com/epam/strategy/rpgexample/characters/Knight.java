package com.epam.strategy.rpgexample.characters;

import com.epam.strategy.rpgexample.weapon.CrossbowBehaviour;

public class Knight extends Character {
    public Knight() {
        name = "Knight";
        weaponBehaviour = new CrossbowBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("Take a highest position...");
        weaponBehaviour.useWeapon();
    }
}
