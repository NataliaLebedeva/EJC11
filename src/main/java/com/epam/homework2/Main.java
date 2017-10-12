package com.epam.homework2;

import org.apache.commons.lang3.math.NumberUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String param = reader.readLine();
        int value = 0;
        int hours = 0;
        float realMinutes = 0.0f;
        int minutes = 0;

        value = Integer.parseInt(param);
        if (value < 0) {
            throw new Exception("Negative number");
        }


    }

}
