package com.epam.homework3.ducks;

import com.epam.homework3.posibilities.FlyNoWay;
import com.epam.homework3.posibilities.Squeak;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Nice thing to take bath with");
    }

    public RubberDuck() {
        quackable = new Squeak();
        flyable = new FlyNoWay();
    }
}
