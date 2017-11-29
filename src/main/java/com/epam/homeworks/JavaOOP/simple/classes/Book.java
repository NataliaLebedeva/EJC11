package com.epam.homeworks.JavaOOP.simple.classes;

public class Book {
    private int price;

    public Book() {
        price = 0;
    }

    public Book(int price) {
        setPrice(price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
