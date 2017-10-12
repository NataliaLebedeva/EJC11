package com.epam.lesson05102017.inheritance;

/**
 * Created by Nata on 05.10.2017.
 */
public interface IFeedable {
    default void feed() {
        System.out.println("Unknown Feedable creature has been fed.");
    };
}
