package com.epam.lesson24102017.taskException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {
    public static boolean isBarsik(String name) {
        if (name.equalsIgnoreCase("barsik")) {
            return true;
        }
        throw new InputMismatchException();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = reader.readLine();
            if (line.equalsIgnoreCase("exit")) break;
            try {
                System.out.println(isBarsik(line) + ", cat's name is " + line);
            } catch (InputMismatchException i) {
                System.err.println("Excepted name is Barsik, but you taped " + line);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}