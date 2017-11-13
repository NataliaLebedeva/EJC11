package com.epam.additional.tasks.task1;

import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String separator = bufferedReader.readLine();
//        Character sep = separator.charAt(0);

//        String myString = bufferedReader.readLine();
//        String[] splitStrings = split(sep, myString);
//        printArrayReverse(splitStrings);

//        bufferedReader.close();
//        System.out.println();
        String[] testString;

//        String[] testString = split('~', ";lk~lkj~567~ilj3~54");
//        printArrayReverse(testString);
//
//        testString = split('%', ";l%k~lkj~5%67~ilj3%~54");
//        printArrayReverse(testString);
//
//        testString = split('$', "a$g$h$j");
//        printArrayReverse(testString);
        testString = split('_', "_a_v_");
        printArrayReverse(testString);

        testString = splitCollection('_', "aa_vv_dd");
        printArrayReverse(testString);

//        printArrayReverse("_a_v_".split("_"));


    }

    private static String[] splitCollection(Character separator, String string) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (separator.equals(string.charAt(i))) {
                stack.push("");
            } else {
                if (stack.isEmpty()) {
                    stack.push(Character.toString(string.charAt(i)));
                } else {
                    stack.push(stack.pop() + string.charAt(i));
                }
            }
        }

        return stack.toArray(new String[]{});
    }

    public static void printArrayReverse(String[] testString) {
        String[] strings = Arrays.copyOf(testString, testString.length);
        ArrayUtils.reverse(strings);
        System.out.println(Arrays.toString(strings));
    }



    public static String[] split(Character separator, String sourceString) {

        if (sourceString.charAt(0) == separator) {
            sourceString = String.copyValueOf(sourceString.toCharArray(), 1, sourceString.length() - 1);
        }

        if (sourceString.charAt(sourceString.length() - 1) == separator) {
            sourceString = String.copyValueOf(sourceString.toCharArray(), 0, sourceString.length() - 1);
        }

        int count = sourceString.length() - sourceString.replaceAll(Character.toString(separator), "").length();
        String[] separatedStrings = new String[count + 1];

        Arrays.fill(separatedStrings, "");

        int separateCount = 0;
        for (int i = 0; i < sourceString.length(); i++) {
            if (separator.equals(sourceString.charAt(i))) {
                separateCount++;
            } else {
                separatedStrings[separateCount] += Character.toString(sourceString.charAt(i));
            }
        }
        return separatedStrings;
    }

}
