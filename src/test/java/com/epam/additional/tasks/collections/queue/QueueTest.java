package com.epam.additional.tasks.collections.queue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QueueTest extends QueueTestPreSet {

    @Test
    public void testPeek() throws Exception {
    }

    @Test
    public void testPoll() throws Exception {
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void testNegativeIsEmpty() {
        String item = "new";
        queue.add(item);
        Assert.assertFalse(queue.isEmpty());
    }

    @Test
    public void testSize() throws Exception {
        String i = "theme";
        String item = "item";
        Assert.assertTrue(queue.isEmpty());
        queue.add(i);
        queue.add(item);
        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(queue.size(), 2);

    }
}