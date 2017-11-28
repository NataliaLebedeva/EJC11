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

    @Test
    public void testQueueForEach() {
        queue.add("qwe 0");
        queue.add("qwe 1");
        queue.add("qwe 2");
        queue.add("qwe 3");
        queue.add("qwe 4");

        for (String e : queue) {
            System.out.println(e);
        }

        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(queue.size(), 5);
    }
}