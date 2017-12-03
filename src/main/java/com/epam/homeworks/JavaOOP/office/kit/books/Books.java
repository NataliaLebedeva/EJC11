package com.epam.homeworks.JavaOOP.office.kit.books;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Books extends Stationery {
    protected String author;

    public Books(String nameStationery, double price, String author) {
        super(nameStationery, price);
        this.author = author;
    }
}
