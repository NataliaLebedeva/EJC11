package com.epam.homeworks.JavaOOP.office.kit.stapleStuff;

public class Stapler extends StapleStuff {
    public Stapler(String nameStationery, double price) {
        super(nameStationery, price);
    }

    @Override
    public String toString() {
        return "Stapler{" +
                "price=" + price +
                '}';
    }
}
