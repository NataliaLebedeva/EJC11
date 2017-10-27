package com.epam.additional.tasks.task2;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int shift = 1;
        String string = "abcd";

        System.out.println(shiftArray(shift, string));
        System.out.println(shift(shift, string));
    }

    static String shift(int shift, String string) {
        if (StringUtils.isEmpty(string))
            return string;

        int length = string.length();

        if(shift == length || shift == 0)
            return string;

        if(shift > length) {
            shift %= length;
        }

        int lengthShift = length - shift;
        return string.substring(lengthShift) + string.substring(0, lengthShift);
    }

    private static String shiftArray(int shift, String string) {
        if(shift == string.length() || shift == 0)
            return string;

        if (StringUtils.isEmpty(string))
            return string;

        char[] chars = string.toCharArray();
        int newLength = chars.length - shift;
        char[] shiftedArray = ArrayUtils.addAll(
                Arrays.copyOf(chars, newLength),
                Arrays.copyOfRange(chars, newLength, chars.length)
        );

        // [a, b, c, d]
        // 1
        // [d, a, b, c]
        // 2
        // [c, d, a, b]
        return new String(shiftedArray );
    }
}
