package com.epam.strategy;

/**
 * Created by Nata on 17.10.2017.
 */
public class RedHatDuck extends AbstractDuck {
    public RedHatDuck(SpeakBehavior speakBehavior) {
        super(speakBehavior);
    }

    @Override
    public void getInfo() {
        System.out.println("I'm a redhat duck!");
    }
}
