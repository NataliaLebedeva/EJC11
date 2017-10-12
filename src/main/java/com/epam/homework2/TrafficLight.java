package com.epam.homework2;

class TrafficLight {

    private static int[][] range = new int[][]{
            {0, 1},
            {2, 4},
            {5, 9},
    };

    static LIGHT getCurrentLight(final long minutesRaw) {
        int index = -1;
        int minutes = (int) minutesRaw % 10;

        for (int i = 0; i < range.length; i++) {
            if (minutes >= range[i][0] && minutes <= range[i][1])
                index = i;
        }

        return LIGHT.getBuValue(index);
    }
}
