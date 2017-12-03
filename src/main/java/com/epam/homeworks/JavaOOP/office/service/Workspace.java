package com.epam.homeworks.JavaOOP.office.service;

import com.epam.homeworks.JavaOOP.office.Employee;
import com.epam.homeworks.JavaOOP.office.kit.Stationery;

import java.util.ArrayList;

public class Workspace {
    private Employee employee;
    public ArrayList<Stationery> kit;

    Workspace(Employee employee) {
        setEmployee(employee);
        this.kit = new ArrayList<>(20);
    }

    private void setEmployee(Employee employee) {
        this.employee = employee;
    }

    Employee getEmployee() {
        return employee;
    }

    public void add(Stationery stationery) {
        kit.add(stationery);
    }

    double getTotalPrice() {
        double totalPrice = 0;
        for (Stationery s : kit)
            totalPrice += s.getPrice();
        return totalPrice;
    }

}
