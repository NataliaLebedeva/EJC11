package com.epam.lesson31102017.enumCats;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * Created by Nata on 31.10.2017.
 */
public class MainTest {
    private Main main;

    @BeforeTest
    public void setup(){
        main = new Main();

    }

    @Test
    public void testGetCatName() {
        Assert.assertEquals("You can come in", main.isCatInList("BARSIK"));
    }

    @Test
    public void negativeTestGetCatName() {
        Assert.assertEquals("You can come in", main.isCatInList("RIZHIK"));
    }
}
