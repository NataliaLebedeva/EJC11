package com.epam.homework2;

/**
 * Represents current light color of trafficlight
 * @autor Natalia Lebedeva
 */
public class LightColor {
    /**Name of color */
    private String name;

    /**Index to choose the appropriate name */
    private int index;

    /**
     * Fills class field "name" by checking index
     */
    public LightColor(int index) {
        this.index = index;
        switch (index) {
            case 0:
                this.name = "Red";
                break;
            case 1:
                this.name = "Yellow";
                break;
            case 2:
                this.name = "Green";
                break;
        }
    }

    /**
     * Returns name of current object
     */
    public String getName() {
        return name;
    }

    /**
     * Returns index of current object
     */
    public int getIndex() {
        return index;
    }

}
