package com.epam.homeworks.JavaOOP.office.service;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;

import java.util.Comparator;

public class CompareByName implements Comparator<Stationery> {

    @Override
    public int compare(Stationery o1, Stationery o2) {
        int res = o1.getNameStationery().compareTo(o2.getNameStationery());
        return res;
    }
}
