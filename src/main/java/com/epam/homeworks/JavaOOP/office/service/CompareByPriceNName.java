package com.epam.homeworks.JavaOOP.office.service;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;

import java.util.Comparator;

public class CompareByPriceNName implements Comparator<Stationery> {

    @Override
    public int compare(Stationery o1, Stationery o2) {
        int res;
        int compareName = o1.getNameStationery().compareTo(o2.getNameStationery());
        if (compareName != 0) {
            res = compareName;
        } else {
            res = Double.compare(o1.getPrice(), o2.getPrice());
        }
        return res;
    }
}
