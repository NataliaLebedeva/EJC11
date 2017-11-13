package com.epam.lessons.lesson24102017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(main.getNumber(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getNumber(String parameter) {
        if (isNumber(parameter)) {
            return Integer.parseInt(parameter);
        }
        throw new IllegalArgumentException("Param not int " + parameter);
    }

    private boolean isNumber(String parametet) {
        return parametet.matches("[-+]?\\d+");
    }
}
