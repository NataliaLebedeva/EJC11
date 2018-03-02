package com.epam.additional.tasks.lambda.lesson4;

import lombok.Getter;

@Getter
public class Trader {
    private String name;
    private String city;

    public Trader(String n, String c) {
        this.name = n;
        this.city = c;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}
