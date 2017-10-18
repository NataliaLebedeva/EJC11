package com.epam.strategy.rpgexample.characters;

import com.epam.strategy.rpgexample.weapon.WeaponBehaviour;

public abstract class Character {

    protected String name;

    protected WeaponBehaviour weaponBehaviour;

    public abstract void fight();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void showYourself() {
        System.out.println(name);
    }
}
