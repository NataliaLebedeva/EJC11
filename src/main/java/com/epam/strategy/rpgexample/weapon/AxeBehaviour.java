package com.epam.strategy.rpgexample.weapon;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Hit enemy by axe !");
    }
}
