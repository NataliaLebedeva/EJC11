package com.epam.lessons.lesson17102017;

/**
 * Created by Nata on 17.10.2017.
 */
public class Mathematics {
    int i;

    public Mathematics(Num num) {
        i = 2;
    }

    public Mathematics (Int nt){
        i = 3;
    }
}

class Num {

}

class Int extends  Num {
}