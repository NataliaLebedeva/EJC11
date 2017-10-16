package com.epam.utils;

public class Helper {
    /**
     * Checks if the point belongs to the segment
     * @param point - checking value, time in a homework2
     * @param left  - left border of segment, LIGHT_RANGE[i][0] in a homework2
     * @param right - right border of segment, LIGHT_RANGE[i][1] in a homework2
     * @return      - TRUE if the "point" belongs to the segment between "left" and "right" parameters
     *              - FALSE if the "point" doesn't belongs to the segment between "left" and "right" parameters
     */
    public static Boolean isInRange(int point, int left, int right) {
        return point >= left && point <= right;
    }

    public static boolean isDigit(String myString) {
        /**
         * Checks the string
         * @return - FALSE if the string is empty
         *         - FALSE if the string is character
         *         - TRUE if the string is a digit
         */
        if (myString.isEmpty())
            return false;
        for (int i = 0; i < myString.length(); i++)
            if (!Character.isDigit(myString.charAt(i)))
                return false;
        return true;
    }
}
