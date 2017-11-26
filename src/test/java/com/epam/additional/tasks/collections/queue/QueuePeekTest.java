package com.epam.additional.tasks.collections.queue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QueuePeekTest extends QueueTestPreSet {

    @Test
    public void testPeekFirst() throws Exception {
        String i = "theme";
        String j = "home";
        String item = "item";
        Assert.assertTrue(queue.isEmpty());
        queue.add(i);
        queue.add(j);
        queue.add(item);
        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(queue.size(), 3);
        Assert.assertEquals(queue.peekFirst(), "theme");
    }

    @Test
    public void testPeekLast() throws Exception {
        String i = "theme";
        String j = "home";
        String item = "item";
        Assert.assertTrue(queue.isEmpty());
        queue.add(i);
        queue.add(j);
        queue.add(item);
        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(queue.size(), 3);
        Assert.assertEquals(queue.peekLast(), "item");
    }


}
