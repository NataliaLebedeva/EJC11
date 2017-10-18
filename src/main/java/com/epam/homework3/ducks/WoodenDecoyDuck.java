package com.epam.homework3.ducks;

import com.epam.homework3.posibilities.FlyNoWay;
import com.epam.homework3.posibilities.Quack;

public class WoodenDecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Necessary thing for hunter");
    }

    public WoodenDecoyDuck() {
        quackable = new Quack();
        flyable = new FlyNoWay();
    }
}
