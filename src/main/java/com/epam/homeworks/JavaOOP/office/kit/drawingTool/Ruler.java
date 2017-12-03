package com.epam.homeworks.JavaOOP.office.kit.drawingTool;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ruler extends Stationery {
    private int rulerLength;
    public Ruler(String nameStationery, double price, int rulerLength) {
        super(nameStationery, price);
        this.rulerLength = rulerLength;
    }
}
