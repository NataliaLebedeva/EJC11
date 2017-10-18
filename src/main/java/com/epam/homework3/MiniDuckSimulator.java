package com.epam.homework3;

import com.epam.homework3.ducks.Duck;
import com.epam.homework3.ducks.MallardDuck;
import com.epam.homework3.ducks.RubberDuck;
import com.epam.homework3.ducks.WoodenDecoyDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck ducks[] = {
                new MallardDuck(), new WoodenDecoyDuck(), new RubberDuck()
        };

        for (int i = 0; i < ducks.length; i++) {
            System.out.println();
            ducks[i].display();
            ducks[i].performFly();
            ducks[i].performQuack();
            ducks[i].swim();
        }

    }
}

