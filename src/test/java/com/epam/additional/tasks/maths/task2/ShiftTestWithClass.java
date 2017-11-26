package com.epam.additional.tasks.maths.task2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShiftTestWithClass {

    @DataProvider
    public Object[][] myUniqueProvider() {
        return new Object[][]{
                {"dabc", new ShiftData(1, "abcd")},
                {"bcda", new ShiftData(3, "abcd")},
                {"abcd", new ShiftData(0, "abcd")},
                {"abcd", new ShiftData(4, "abcd")},
                {"", new ShiftData(1, "")},
                {null, new ShiftData(1, null)},
                {"dabc", new ShiftData(5, "abcd")},
        };
    }

    @Test(dataProvider = "myUniqueProvider")
    void scenario(String expected, ShiftData data) {
        Assert.assertEquals(expected, Main.shift(data.getShift(), data.getSource()));
    }

}