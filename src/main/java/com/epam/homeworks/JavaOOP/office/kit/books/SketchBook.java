package com.epam.homeworks.JavaOOP.office.kit.books;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SketchBook extends Books {
    private String paperFormat;
    private String superName;

    public SketchBook(String nameStationery, double price, String paperFormat) {
        super(nameStationery, price);
        this.paperFormat = paperFormat;
    }

    public SketchBook(String nameStationery, double price, String paperFormat, String superName) {
        super(nameStationery, price);
        this.paperFormat = paperFormat;
        this.superName = superName;
    }
}


