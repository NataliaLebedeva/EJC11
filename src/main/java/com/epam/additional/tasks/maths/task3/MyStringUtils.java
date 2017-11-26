package com.epam.additional.tasks.maths.task3;

public class MyStringUtils {
    private static final Character[] PROHIBITED_CHARS = new Character[]{' ', '!', '@', '#', '$'};

    private static Character[] extractSymbolsByLength(int stringLength, String inputString) {
        Character[] symbols = new Character[stringLength];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = inputString.charAt(i);
        }
        return symbols;
    }

    public static String getNormalizedString(int stringLength, String inputString) {
        StringBuilder normalString = new StringBuilder("");
        Character[] symbols = extractSymbolsByLength(stringLength, inputString);

        for (Character symbol : symbols) {
            if (!isProhibitedSymbol(symbol)) {
                normalString.append(symbol);
            }
        }
        return normalString.toString().toLowerCase();
    }

    private static boolean isProhibitedSymbol(Character ch) {
        for (Character prohibitedChar : PROHIBITED_CHARS) {
            if (ch.equals(prohibitedChar)) {
                return true;
            }
        }
        return false;
    }
}
