package com.epam.lesson05102017.inheritance.cat;

import com.epam.lesson05102017.inheritance.Animal;

/**
 * Created by Nata on 05.10.2017.
 */
public class Cat extends Animal {
    @Override
    public void feed() {
        System.out.println("Unknown cat has been fed.");
    }
}
