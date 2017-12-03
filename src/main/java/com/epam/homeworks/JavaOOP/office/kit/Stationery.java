package com.epam.homeworks.JavaOOP.office.kit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Stationery {
    private String nameStationery;
    protected double price;

    @Override
    public String toString() {
        return "Stationery{" +
                "nameStationery='" + this.nameStationery + '\'' +
                ", price=" + this.price +
                '}';
    }
}
