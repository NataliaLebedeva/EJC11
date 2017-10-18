package com.epam.homework3.posibilities;

public class FlyNoWay implements IFlyable {

    @Override
    public void fly() {
        System.out.println("I have no wings");
    }
}
