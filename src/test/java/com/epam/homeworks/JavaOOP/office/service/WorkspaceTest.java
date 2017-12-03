package com.epam.homeworks.JavaOOP.office.service;

import com.epam.homeworks.JavaOOP.office.Employee;
import com.epam.homeworks.JavaOOP.office.kit.Stationery;
import com.epam.homeworks.JavaOOP.office.kit.books.ManualBook;
import com.epam.homeworks.JavaOOP.office.kit.drawingTool.Pen;
import com.epam.homeworks.JavaOOP.office.kit.stapleStuff.Stapler;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkspaceTest {
    private Workspace workspace;

    @BeforeMethod
    public void setup() {
        Employee employee = new Employee("Natalia", "Lebedeva", 83);
        workspace = new Workspace(employee);
    }

    @Test
    void testGetTotalPrice() {
        Assert.assertTrue(workspace.kit.isEmpty());
        Stationery pen = new Pen("pen", 5.3, "black", 0.3, "Bic");
        Stationery stapler = new Stapler("stapler", 54.2);
        Stationery javaBook = new ManualBook("manual", 740.5, "java");
        workspace.kit.add(pen);
        workspace.kit.add(stapler);
        workspace.kit.add(javaBook);
        Assert.assertEquals(workspace.kit.size(), 3);
        Assert.assertEquals(workspace.getTotalPrice(), 800.0);
    }

    @Test
    void testGetEmployee() {
        Assert.assertEquals(workspace.getEmployee().getName(), "Natalia");
        Assert.assertEquals(workspace.getEmployee().getSurname(), "Lebedeva");
        Assert.assertEquals(workspace.getEmployee().getSpecializationID(), 83);

    }

}