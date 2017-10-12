package com.epam.lesson05102017.inheritance;

import com.epam.lesson05102017.Main;
import com.epam.lesson05102017.inheritance.cat.Cat;
import com.epam.lesson05102017.inheritance.cat.Oriental;
import com.epam.lesson05102017.inheritance.dog.Pug;

import java.util.ArrayList;

/**
 * Created by Nata on 05.10.2017.
 */
public class AnimalObserver {
    public static void main(String[] args) {
        final Oriental oriental = new Oriental();
        final Pug pug = new Pug();

        final Animal animal = new Animal();
        final Animal animal1 = new Cat();
        final Animal animal2 = new Pug();

        new ArrayList<Animal>() {{
            add(oriental);
            add(pug);
            add(animal);
            add(animal1);
            add(animal2);
        }}.forEach(AnimalObserver::FeedingProcess);
    }


    public static void FeedingProcess(IFeedable feedable) {
        feedable.feed();
    }

}
