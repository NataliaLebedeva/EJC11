package com.epam.strategy.rpgexample.characters;

import com.epam.strategy.rpgexample.weapon.SwordBehaviour;

public class King extends Character {
    public King() {
        name = "King";
        weaponBehaviour = new SwordBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("Hiding behind Knight's back...");
        weaponBehaviour.useWeapon();
    }
}
