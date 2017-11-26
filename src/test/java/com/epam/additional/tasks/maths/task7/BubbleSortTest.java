package com.epam.additional.tasks.maths.task7;

import com.epam.additional.tasks.maths.task7.BubbleSort;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();
    @Test
    public void testBubbleIntSort1() throws Exception {
        int[] data = {5, 1, 3, 4};
        int before = data.length;
        bubbleSort.bubbleIntSort(data);
        Assert.assertEquals(before, data.length);
        Assert.assertEquals(data[0], 1);
        Assert.assertEquals(data[1], 3);
        Assert.assertEquals(data[2], 4);
        Assert.assertEquals(data[3], 5);
    }

    @Test
    public void testBubbleIntSort2() throws Exception {
        int[] data = {5, 9, 3, 6, 4, 2, 8, 7, 1};
        int before = data.length;
        bubbleSort.bubbleIntSort(data);
        Assert.assertEquals(before, data.length);
        Assert.assertEquals(data[0], 1);
        Assert.assertEquals(data[1], 2);
        Assert.assertEquals(data[2], 3);
        Assert.assertEquals(data[3], 4);
        Assert.assertEquals(data[4], 5);
        Assert.assertEquals(data[5], 6);
        Assert.assertEquals(data[6], 7);
        Assert.assertEquals(data[7], 8);
        Assert.assertEquals(data[8], 9);
    }

}