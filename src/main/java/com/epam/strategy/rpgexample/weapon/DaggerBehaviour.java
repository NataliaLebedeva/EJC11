package com.epam.strategy.rpgexample.weapon;

public class DaggerBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Hit enemy by poisoned dagger !");
    }
}
