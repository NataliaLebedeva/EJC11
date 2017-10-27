package com.epam.homework2;

import com.epam.utils.Helper;

/**
 * Allows to return color of light in according to time
 *
 * @autor Natalia Lebedeva
 */

public class TrafficLight {

    /**
     * Contains borders for each of colors
     * Changed borders for checking logic are in comments
     */
    private static final int[][] LIGHT_RANGE = {
            {0, 1},
            {2, 4},
            {5, 9}
    };

    /**
     * Returns color of light in according to time
     *
     * @param time - time in minutes.
     * @return lightColor - current object according to time
     * @throws NullPointerException     - if time is null.
     * @throws IllegalArgumentException - if time is negative.
     */
    public static LightColor GetLight(Integer time) throws IllegalArgumentException, NullPointerException {

        if (time == null) {
            throw new NullPointerException("Time can not be null");
        }
        if (time < 0) {
            throw new IllegalArgumentException("Time should be positive number");
        }
        if (time >= 60) {
            //we don't take hours into account
            time %= 60;
        }
        LightColor lightColor = null;

        Integer actualMinutes = time;

        if (time >= LIGHT_RANGE[2][1] + 1)
            actualMinutes = time % (LIGHT_RANGE[2][1] + 1);

        for (int i = 0; i < LIGHT_RANGE.length; i++) {
            if (Helper.isInRange(actualMinutes, LIGHT_RANGE[i][0], LIGHT_RANGE[i][1])) {
                lightColor = new LightColor(i);
            }
        }
        return lightColor;
    }

}
