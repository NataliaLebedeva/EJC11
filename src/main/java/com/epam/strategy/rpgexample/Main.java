package com.epam.strategy.rpgexample;

import com.epam.strategy.rpgexample.characters.*;
import com.epam.strategy.rpgexample.characters.Character;
import com.epam.strategy.rpgexample.weapon.AxeBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<Character>() {{
           add(new Queen());
           add(new King());
           add(new Troll());
           add(new Knight());
        }};


        for (Character character : characters) {
            character.showYourself();
            character.fight();
            System.out.println();
        }
    }
}
