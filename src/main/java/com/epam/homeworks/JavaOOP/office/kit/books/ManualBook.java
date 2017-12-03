package com.epam.homeworks.JavaOOP.office.kit.books;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManualBook extends Books {
    private String language;

    public ManualBook(String nameStationery, double price, String language) {
        super(nameStationery, price);
        this.language = language;
    }
}
