package com.epam.homeworks.bySerg.homework3;

import com.epam.homeworks.bySerg.homework3.ducks.Duck;
import com.epam.homeworks.bySerg.homework3.ducks.MallardDuck;
import com.epam.homeworks.bySerg.homework3.ducks.RubberDuck;
import com.epam.homeworks.bySerg.homework3.ducks.WoodenDecoyDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck ducks[] = {
                new MallardDuck(),
                new WoodenDecoyDuck(),
                new RubberDuck()
        };

        for (Duck duck : ducks) {
            System.out.println();
            duck.display();
            duck.performFly();
            duck.performQuack();
            duck.swim();
        }
    }
}

