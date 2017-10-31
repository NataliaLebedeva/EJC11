package com.epam.lesson31102017.enumCats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nata on 31.10.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(main.readCatName(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private String readCatName(BufferedReader reader) throws IOException { //
        String catName = reader.readLine();
        return isCatInList(catName);
    }

    public String isCatInList(String catName) {
        for (Cat cat : Cat.values()) {
            if (cat == Cat.valueOf(catName)) { // Objects.equals(cat.toString(), catName)
                return "You can come in";
            }
        }
        throw new IllegalArgumentException("No such cat at this home: " + catName);
    }
}
