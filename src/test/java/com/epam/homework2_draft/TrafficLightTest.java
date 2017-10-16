package com.epam.homework2_draft;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

class TrafficLightTest {

    @Test
    void testRED() {
        long time = 0;
        LIGHT actualLight = TrafficLight.getCurrentLight(time);
        LIGHT expectedLight = LIGHT.RED;

        Assert.assertEquals(String.format("On time %s expectedLight %s but actual %s", time, expectedLight, actualLight), expectedLight, actualLight);
    }

    @Test
    void testYELLOW() {
        long time = 2;
        LIGHT actualLight = TrafficLight.getCurrentLight(time);
        LIGHT expectedLight = LIGHT.YELLOW;

        Assert.assertEquals(String.format("On time %s expectedLight %s but actual %s", time, expectedLight, actualLight), expectedLight, actualLight);
    }

    @Test
    void testGREEN() {
        long time = 5;
        LIGHT actualLight = TrafficLight.getCurrentLight(time);
        LIGHT expectedLight = LIGHT.GREEN;

        Assert.assertEquals(String.format("On time %s expectedLight %s but actual %s", time, expectedLight, actualLight), expectedLight, actualLight);
    }

    @Test
    void dataTest() {
        Object[][] objects = new Object[][]{
                { 12L, LIGHT.YELLOW },
                { 17L, LIGHT.GREEN  },
                { 2345L, LIGHT.GREEN },
                { 10L, LIGHT.RED },
                { 0L, LIGHT.RED },
                { 12L, LIGHT.YELLOW },
        };

        for (Object[] object : objects) {
            long time = (long) object[0];
            LIGHT actualLight = TrafficLight.getCurrentLight(time);
            LIGHT expectedLight = (LIGHT) object[1];
            Assert.assertEquals(String.format("On time %s expectedLight %s but actual %s", time, expectedLight, actualLight), expectedLight, actualLight);
        }
    }
}
