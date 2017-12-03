package com.epam.homeworks.JavaOOP.office.kit.drawingTool;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WritingTools extends Stationery {
    protected String color;

    public WritingTools(String nameStationery, double price, String color) {
        super(nameStationery, price);
        this.color = color;
    }
}
