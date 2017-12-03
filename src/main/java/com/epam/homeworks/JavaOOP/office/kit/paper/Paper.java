package com.epam.homeworks.JavaOOP.office.kit.paper;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;

public class Paper extends Stationery {
    private int density;

    public Paper(String nameStationery, double price, int density) {
        super(nameStationery, price);
        this.density = density;
    }
}
