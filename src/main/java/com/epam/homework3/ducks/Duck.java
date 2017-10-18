package com.epam.homework3.ducks;

import com.epam.homework3.posibilities.IFlyable;
import com.epam.homework3.posibilities.IQuackable;

public abstract class Duck {
    IFlyable flyable;
    IQuackable quackable;

    public Duck() {    }
    public void swim() {
        System.out.println("All ducks can swim");
    }
    public abstract void display();

    public void performQuack() {
        quackable.quack();
    }

    public void performFly() {
        flyable.fly();
    }
}
