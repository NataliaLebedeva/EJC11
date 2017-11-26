package com.epam.additional.tasks.collections.queue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QueuePollTest extends QueueTestPreSet {

    @Test
    void testPollEmpty () {
        Assert.assertEquals(queue.poll(), null);
    }

    @Test
    void  testPollSingle() {
        queue.add("one");
        int before = queue.size();
        Assert.assertEquals(queue.poll(), "one");
        Assert.assertEquals(queue.size(), before -1);
    }

    @Test
    void testPoll() {
        queue.add("theme");
        queue.add("home");
        queue.add("item");
        int before = queue.size();
        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(before, 3);
        Assert.assertEquals(queue.poll(),"theme");
        Assert.assertEquals(queue.size(), before - 1);
        Assert.assertEquals(queue.peekFirst(), "home");
    }

}
