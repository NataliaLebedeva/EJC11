package com.epam.homeworks.bySerg.homework3.ducks;

import com.epam.homeworks.bySerg.homework3.posibilities.FlyWithWings;
import com.epam.homeworks.bySerg.homework3.posibilities.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }

    public MallardDuck() {
        quackable = new Quack();
        flyable = new FlyWithWings();
    }
}
