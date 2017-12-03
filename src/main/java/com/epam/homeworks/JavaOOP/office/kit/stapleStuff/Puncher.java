package com.epam.homeworks.JavaOOP.office.kit.stapleStuff;

public class Puncher extends StapleStuff {
    public Puncher(String nameStationery, double price) {
        super(nameStationery, price);
    }

    @Override
    public String toString() {
        return "Puncher{" +
                "price=" + price +
                '}';
    }
}
