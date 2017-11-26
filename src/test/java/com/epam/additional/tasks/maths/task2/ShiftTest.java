package com.epam.additional.tasks.maths.task2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShiftTest {

    @DataProvider
    public Object[][] myUniqueProvider() {
        return new Object[][]{
                {"dabc", new Object[] {1, "abcd"}},
                {"bcda", new Object[] {3, "abcd"}},
                {"abcd", new Object[] {0, "abcd"}},
                {"abcd", new Object[] {4, "abcd"}},
                {"", new Object[] {1, ""}},
                {"dabc", new Object[] {5, "abcd"}},
        };
    }

    @Test(dataProvider = "myUniqueProvider")
    void scenario(String expected, Object[] data) {
        Assert.assertEquals(expected, Main.shift((Integer) data[0], (String) data[1]));
    }

}
