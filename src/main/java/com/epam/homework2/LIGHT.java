package com.epam.homework2;

public enum LIGHT {
    GREEN("2"), YELLOW("1"), RED("0");

    String value;

    LIGHT(String value) {
        this.value = value;
    }

    public static LIGHT getBuValue(int value) {
        switch (value) {
            case 0: return RED;
            case 1: return YELLOW;
            case 2: return GREEN;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        switch (value) {
            case "0": return "RED";
            case "1": return "YELLOW";
            case "2": return "GREEN";
            default:
                return "";
        }
    }


}
