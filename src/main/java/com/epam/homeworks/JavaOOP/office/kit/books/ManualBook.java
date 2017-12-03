package com.epam.homeworks.JavaOOP.office.kit.books;

import com.epam.additional.tasks.maths.task6.Prime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManualBook extends Books {
    private String language;

    public ManualBook(String nameStationery, double price,String author, String language) {
        super(nameStationery, price, author);
        this.language = language;
    }

    @Override
    public String toString() {
        return "ManualBook{" +
                "language='" + language + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
