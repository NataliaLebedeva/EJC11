package com.epam.strategy.rpgexample.characters;

import com.epam.strategy.rpgexample.weapon.AxeBehaviour;

public class Troll extends Character {
    public Troll() {
        name = "Troll";
        weaponBehaviour = new AxeBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("Rush into enemy pack...");
        weaponBehaviour.useWeapon();
    }
}
