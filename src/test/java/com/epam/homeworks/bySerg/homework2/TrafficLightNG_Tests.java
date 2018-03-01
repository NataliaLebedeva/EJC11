package com.epam.homeworks.bySerg.homework2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TrafficLightNG_Tests {

    private static final LightColor RED = new LightColor(0);
    private static final LightColor YELLOW = new LightColor(1);
    private static final LightColor GREEN = new LightColor(2);

    @DataProvider
    public Object[][] trafficLightTestMap() {
        return new Object[][]{
                {0, RED},
                {1, RED},
                {2, YELLOW},
                {3, YELLOW},
                {4, YELLOW},
                {5, GREEN},
                {6, GREEN},
                {7, GREEN},
                {8, GREEN},
                {9, GREEN},
                {10, RED},
                {12, YELLOW},
                {15, GREEN},
                {60, RED},
                {63, YELLOW},
                {59, GREEN}
        };
    }

    @DataProvider
    public Object[] trafficLightNegativeTestMap() {
        return new Object[]{
                -1, null
        };
    }

    @Test(dataProvider = "trafficLightTestMap")
    public void test1(int i, LightColor color) {
        System.out.println(String.format("int: %s , String: %s", i, color.getName()));
    }


    @Test(dataProvider = "trafficLightTestMap")
    public void trafficLightTestPositiveScenario(Integer time, LightColor expectedLightColor) throws Exception {
        LightColor actualLightColor = TrafficLight.GetLight(time);

        Assert.assertEquals(expectedLightColor.getName(), actualLightColor.getName());
        Assert.assertEquals(expectedLightColor.getIndex(), actualLightColor.getIndex());
    }

    @Test(expectedExceptions = {IllegalArgumentException.class, NullPointerException.class},
            dataProvider = "trafficLightNegativeTestMap")
    public void trafficLightTestNegativeScenario(Integer time) throws IllegalArgumentException {
        TrafficLight.GetLight(time);
    }
}
