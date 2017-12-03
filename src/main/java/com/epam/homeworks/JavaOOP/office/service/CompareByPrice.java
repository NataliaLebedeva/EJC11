package com.epam.homeworks.JavaOOP.office.service;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        int res;
        double price1 = o1.getPrice();
        double price2 = o2.getPrice();
        res = Double.compare(price1, price2);
        return res;

    }
}

