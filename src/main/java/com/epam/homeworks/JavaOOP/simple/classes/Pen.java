package com.epam.homeworks.JavaOOP.simple.classes;

public class Pen {
    private int price;
    private String color;
    private double thickness;

    public Pen() {
        price = 0;
        color = "black";
        thickness = 0.5;
    }

    public Pen(int price, String color, double thickness) {
        setPrice(price);
        setColor(color);
        setThickness(thickness);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getThickness() {
        return thickness;
    }
}
