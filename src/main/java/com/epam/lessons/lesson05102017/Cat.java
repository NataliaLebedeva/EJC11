package com.epam.lessons.lesson05102017;

/**
 * Created by Nata on 05.10.2017.
 */
public final class Cat {

    static int a = 0;

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Block");
    }

    public Cat() {
        System.out.println("Constructor");
    }

    static void foo() {
        System.out.println("foo");
    }
}
