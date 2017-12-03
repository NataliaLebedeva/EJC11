package com.epam.homeworks.JavaOOP.office.kit.drawingTool;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Marker extends WritingTools {
    private double thickness;

    public Marker(String nameStationery, double price, String color, double thickness) {
        super(nameStationery, price, color);
        this.thickness = thickness;
    }
}
