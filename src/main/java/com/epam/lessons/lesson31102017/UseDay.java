package com.epam.lessons.lesson31102017;

/**
 * Created by Nata on 31.10.2017.
 */
public class UseDay {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Day.MON.isDayOff(Day.MON));
        System.out.println(Day.MON.isDayOff(Day.SAT));
    }
}
