package com.epam.homeworks.bySerg.homework2;

import org.testng.Assert;
import org.junit.jupiter.api.Test;


public class TrafficLightJUnit_Tests {
    @Test
    void testRED() throws Exception {
        int time = 0;
        LightColor expectedColor = new LightColor( 0);
        LightColor actualColor = TrafficLight.GetLight(time);

        Assert.assertEquals(expectedColor.getName(), actualColor.getName());
        Assert.assertEquals(expectedColor.getIndex(), actualColor.getIndex());
    }

    @Test
    void testYELLOW() throws Exception {
        int time = 2;
        LightColor expectedColor = new LightColor( 1);
        LightColor actualColor = TrafficLight.GetLight(time);

        Assert.assertEquals(expectedColor.getName(), actualColor.getName());
        Assert.assertEquals(expectedColor.getIndex(), actualColor.getIndex());
    }

    @Test
    void testGREEN() throws Exception {
        int time = 5;
        LightColor expectedColor = new LightColor( 2);
        LightColor actualColor = TrafficLight.GetLight(time);

        Assert.assertEquals(expectedColor.getName(), actualColor.getName());
        Assert.assertEquals(expectedColor.getIndex(), actualColor.getIndex());
    }

    @Test
    void testRED1() throws Exception {
        int time = 10;
        LightColor expectedColor = new LightColor( 0);
        LightColor actualColor = TrafficLight.GetLight(time);

        Assert.assertEquals(expectedColor.getName(), actualColor.getName());
        Assert.assertEquals(expectedColor.getIndex(), actualColor.getIndex());
    }

    @Test
    void testYELLOW1() throws Exception {
        int time = 12;
        LightColor expectedColor = new LightColor( 1);
        LightColor actualColor = TrafficLight.GetLight(time);

        Assert.assertEquals(expectedColor.getName(), actualColor.getName());
        Assert.assertEquals(expectedColor.getIndex(), actualColor.getIndex());
    }

    @Test
    void testGREEN1() throws Exception {
        int time = 15;
        LightColor expectedColor = new LightColor( 2);
        LightColor actualColor = TrafficLight.GetLight(time);

        Assert.assertEquals(expectedColor.getName(), actualColor.getName());
        Assert.assertEquals(expectedColor.getIndex(), actualColor.getIndex());
    }
}
