package com.epam.homeworks.JavaOOP.office.kit.stapleStuff;

public class PaperClips extends StapleStuff {
    public PaperClips(String nameStationery, double price) {
        super(nameStationery, price);
    }

    @Override
    public String toString() {
        return "PaperClips{" +
                "name: " + nameStationery +
                " price=" + price +
                '}';
    }
}
