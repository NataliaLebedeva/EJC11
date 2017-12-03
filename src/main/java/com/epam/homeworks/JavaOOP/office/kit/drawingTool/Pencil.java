package com.epam.homeworks.JavaOOP.office.kit.drawingTool;

public class Pencil extends WritingTools{

    private String hardness;

    public Pencil(String nameStationery, double price, String color, String hardness) {
        super(nameStationery, price, color);
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "hardness='" + hardness + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
