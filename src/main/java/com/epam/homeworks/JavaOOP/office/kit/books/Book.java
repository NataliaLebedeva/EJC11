package com.epam.homeworks.JavaOOP.office.kit.books;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Book extends Books {
    private String title;
    private String publishingHouse;

    public Book(String nameStationery, double price, String author, String title, String publishingHouse) {
        super(nameStationery, price, author);
        this.title = title;
        this.publishingHouse = publishingHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (price != book.price) return false;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        int result = (int) price;
        result = 31 * result + title.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
