package com.epam.strategy.rpgexample.weapon;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Hit enemy by sword !");
    }
}
