package com.epam.homeworks.JavaOOP.office.kit.drawingTool;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pen extends WritingTools {
    private double thickness;
    private String producerName;

    public Pen(String nameStationery, double price, String color, double thickness, String producerName) {
        super(nameStationery, price, color);
        this.thickness = thickness;
        this.producerName = producerName;
    }


    @Override
    public String toString() {
        return "Pen{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", thickness=" + thickness +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (price != pen.price) return false;
        if (Double.compare(pen.thickness, thickness) != 0) return false;
        return color.equals(pen.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) price;
        result = 31 * result + color.hashCode();
        temp = Double.doubleToLongBits(thickness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
