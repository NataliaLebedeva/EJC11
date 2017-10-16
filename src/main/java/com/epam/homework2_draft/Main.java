package com.epam.homework2_draft;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String minutesPassed = reader.readLine();

        long value = Integer.parseInt(minutesPassed);
        if (value < 0) {
            throw new Exception("Negative number");
        }
    }

}
