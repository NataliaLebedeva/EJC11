package com.epam.homework2;

import com.epam.utils.Helper;

/**
 * Allows to return color of light in according to time
 *  @autor Natalia Lebedeva
 */

public class TrafficLight {

    private static final int[][] LIGHT_RANGE = {
            {0, 1},
            {2, 4},
            {5, 9}
    };

    /**
     * Returns color of light in according to time
     * @param time - time in minutes.
     * @return lightColor - current object according to time
     * @exception NullPointerException - if time is null.
     * @exception IllegalArgumentException - if time is negative.
     */
    public static LightColor GetLight(Integer time) throws IllegalArgumentException, NullPointerException {

        if (time == null)
            throw new NullPointerException("Time can not be null");

        if (time < 0)
            throw new IllegalArgumentException("Time should be positive number");

        LightColor lightColor = null;
        Integer actualMinutes = time; // minutes responsible for color

        if (time >= LIGHT_RANGE[2][1] + 1)
            actualMinutes = (time  % 60) % LIGHT_RANGE[2][1];
        else if (time < LIGHT_RANGE[2][1] + 1)
            actualMinutes = time % 60;

        for (int i = 0; i < LIGHT_RANGE.length; i++) {
            if (Helper.isInRange(actualMinutes, LIGHT_RANGE[i][0], LIGHT_RANGE[i][1])) {
                lightColor = new LightColor(i);
            }
        }

        return lightColor;
    }

}
