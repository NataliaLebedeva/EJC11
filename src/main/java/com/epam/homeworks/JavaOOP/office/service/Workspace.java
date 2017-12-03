package com.epam.homeworks.JavaOOP.office.service;

import com.epam.homeworks.JavaOOP.office.Employee;
import com.epam.homeworks.JavaOOP.office.kit.Stationery;

import java.util.LinkedList;

public class Workspace {
    private Employee employee;
    private LinkedList<Stationery> kit;

    public Workspace(Employee employee, LinkedList<Stationery> kit) {
        setEmployee(employee);
        this.kit = new LinkedList<>();
    }

    private void setEmployee(Employee employee) {
        this.employee = employee;
    }


}
