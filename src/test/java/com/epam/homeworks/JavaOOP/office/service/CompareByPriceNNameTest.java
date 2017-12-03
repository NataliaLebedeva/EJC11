package com.epam.homeworks.JavaOOP.office.service;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;
import com.epam.homeworks.JavaOOP.office.kit.books.ManualBook;
import com.epam.homeworks.JavaOOP.office.kit.drawingTool.Pen;
import com.epam.homeworks.JavaOOP.office.kit.drawingTool.Pencil;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;


public class CompareByPriceNNameTest {

    @Test
    void compareByPriceNNameTest() {
        Comparator<Stationery> comparator = new CompareByPriceNName();
        Set<Stationery> set = new TreeSet<>(comparator);

        Stationery javaBook = new ManualBook("manual", 740.5, "Bruce Eckel", "java");
        Stationery phpBook = new ManualBook("manual", 540.5, "Alan Forbes", "PHP");
        Stationery pen1 = new Pen("pen", 5.3, "black", 0.3, "Bic");
        Stationery pen2 = new Pen("pen", 5.2, "grey", 0.5, "Harper");
        Stationery pencil = new Pencil("pencil", 5.3, "grey", "b2");

        set.add(javaBook);
        set.add(pen1);
        set.add(phpBook);
        set.add(pencil);
        set.add(pen2);
        for (Stationery s : set) {
            System.out.println(s.toString());
        }

        Object[] objects = set.toArray();
        Assert.assertEquals(objects[0], phpBook);
        Assert.assertEquals(objects[objects.length-1], pencil);
    }

}