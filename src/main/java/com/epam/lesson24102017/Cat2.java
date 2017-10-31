package com.epam.lesson24102017;

public class Cat2 {
    public static void main(String[] args) {
        System.out.println(somethingStrange());
    }

    private static int somethingStrange() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(20);
            System.exit(1);
        } finally {
            System.out.println( 10);
        }
        return 1;
    }
}
