package com.epam.additional.tasks.maths.task1;

import org.apache.commons.lang3.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class SplitStringTask {

    public static void main(String[] args) throws IOException {
        Character divider;
        String inputString;
        String[] substrings;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        divider = reader.readLine().charAt(0);
        inputString = reader.readLine();

        substrings = splitStrings(divider, inputString);
        printArrayReverse(substrings);

        String[] sbstr = inputString.split(String.valueOf(divider));
        printArrayReverse(sbstr);

        reader.close();
        System.out.println("");

    }

    private static void printArrayReverse(String[] substrings) {
        String[] strings = Arrays.copyOf(substrings, substrings.length);
        ArrayUtils.reverse(strings);
        System.out.println(Arrays.toString(strings));
    }

    private static String[] splitStrings(Character divider, String inputString) {
        Stack<String> stack = new Stack<>();
        if(divider.equals(inputString.charAt(0))){
            inputString = String.copyValueOf(inputString.toCharArray(), 1, inputString.length() - 1);
        }
        if(divider.equals(inputString.charAt(inputString.length()-1))){
            inputString = String.copyValueOf(inputString.toCharArray(), 0, inputString.length() - 1);
        }
        for (int i = 0; i < inputString.length(); i ++) {
            if(divider.equals(inputString.charAt(i))) {
                stack.push("");
            } else {
              if (stack.isEmpty()) {
                  stack.push(Character.toString(inputString.charAt(i)));
              } else {
                  stack.push(stack.pop() + inputString.charAt(i));
              }
            }
        }
        return stack.toArray(new String[]{});
    }

}
