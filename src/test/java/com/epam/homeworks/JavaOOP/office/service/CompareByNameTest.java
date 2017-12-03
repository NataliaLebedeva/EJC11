package com.epam.homeworks.JavaOOP.office.service;

import com.epam.homeworks.JavaOOP.office.kit.Stationery;
import com.epam.homeworks.JavaOOP.office.kit.books.ManualBook;
import com.epam.homeworks.JavaOOP.office.kit.drawingTool.Marker;
import com.epam.homeworks.JavaOOP.office.kit.drawingTool.Pen;
import com.epam.homeworks.JavaOOP.office.kit.drawingTool.Pencil;
import com.epam.homeworks.JavaOOP.office.kit.drawingTool.Ruler;
import com.epam.homeworks.JavaOOP.office.kit.stapleStuff.PaperClips;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CompareByNameTest {
    @Test
    void compareByNameTet(){
        Comparator<Stationery> comparator = new CompareByName();
        Set<Stationery> set = new TreeSet<>(comparator);

        Stationery javaBook = new ManualBook("manual", 740.5, "Bruce Eckel", "java");
        Stationery pen1 = new Pen("pen", 5.3, "black", 0.3, "Bic");
        Stationery pencil = new Pencil("pencil", 5.3, "grey", "b2");
        Stationery marker = new Marker("marker", 10.5, "green", 1.6);
        Stationery ruler = new Ruler("ruler", 3.4, 30);
        Stationery paperClips = new PaperClips("paperClips", 1.3);

        set.add(javaBook);
        set.add(pen1);
        set.add(pencil);
        set.add(marker);
        set.add(ruler);
        set.add(paperClips);

        Assert.assertEquals(set.size(), 6);

        for (Stationery s : set) {
            System.out.println(s.toString());
        }

        Object[] objects = set.toArray();
        Assert.assertEquals(objects[0], javaBook);
        Assert.assertEquals(objects[objects.length-1], ruler);

    }

}