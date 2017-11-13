package com.epam.lessons.lesson31102017;

/**
 * Created by Nata on 31.10.2017.
 */
public enum Day {
    MON,
    TUE,
    SAT,
    SUN;


    public boolean isDayOff (Day day){
        return !(day == MON || day == TUE);
    }
}
