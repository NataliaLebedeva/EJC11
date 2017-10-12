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
        hours = value / 60;
        realMinutes = value % 60;

        if (hours > 0) {

            minutes = (int) (realMinutes % 10);
        } else {
            minutes = (int) ((realMinutes * 100) % 10);

        }
        switch (minutes) {
            case 0:
                System.out.println("red");
                break;
            case 1:
                System.out.println("red");
                break;
            case 2:
                System.out.println("yellow");
                break;
            case 3:
                System.out.println("yello");
                break;
            case 4:
                System.out.println("yellow");
                break;
            case 5:
                System.out.println("green");
                break;
            case 6:
                System.out.println("green");
                break;
            case 7:
                System.out.println("green");
                break;
            case 8:
                System.out.println("green");
                break;
            case 9:
                System.out.println("green");
                break;
        }
    }

}
