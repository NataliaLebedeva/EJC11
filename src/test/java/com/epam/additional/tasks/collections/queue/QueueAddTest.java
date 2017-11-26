package com.epam.additional.tasks.collections.queue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QueueAddTest extends QueueTestPreSet {

    @Test
    public void testAdd() throws Exception {
        String item = "item";
        Assert.assertTrue(queue.isEmpty());
        queue.add(item);
        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(queue.peekFirst(), "item");
    }

    @Test
    public void testAdd2() throws Exception {
        Assert.assertTrue(queue.isEmpty());
        queue.add("theme");
        queue.add("home");
        queue.add("item");
        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(queue.size(), 3);
        Assert.assertEquals(queue.peekFirst(), "theme");
        Assert.assertEquals(queue.peekLast(), "item");
    }

}
