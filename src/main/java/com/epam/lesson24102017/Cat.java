package com.epam.lesson24102017;

public class Cat {
    public static void main(String[] args) {
        System.out.println(somethingStrange());
    }
    private static int somethingStrange(){
        int count = 0;
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            count = 10;
            return count;
        } finally {
            count = 20;
            return count;
        }
    }
}
