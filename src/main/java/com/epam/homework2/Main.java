package com.epam.homework2;

import com.epam.utils.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("enter number of minutes");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String timeRaw = reader.readLine();
        String message = null;

        if (Helper.isDigit(timeRaw)) {
            LightColor lightColor1 = TrafficLight.GetLight(Integer.parseInt(timeRaw));
            message = lightColor1.getName();
        } else {
            message = "NaN";
        }
        System.out.println(message);

    }
}
