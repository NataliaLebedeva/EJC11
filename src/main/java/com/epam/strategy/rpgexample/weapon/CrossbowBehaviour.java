package com.epam.strategy.rpgexample.weapon;

public class CrossbowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Shout enemy by crossbow !");
    }
}
