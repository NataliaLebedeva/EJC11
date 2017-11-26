package com.epam.additional.tasks.collections.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StackPeekTest extends StackTestPreSet {

    @Test
    void testPeekSingle() {
        Assert.assertEquals(stack.size(), 0);
        stack.push("one");
        Assert.assertEquals(stack.peek(), "one");
        Assert.assertEquals(stack.size(), 1);
    }

    @Test
    void testPeek() {
        Assert.assertEquals(stack.size(), 0);
        stack.push("one");
        stack.push("two");
        stack.push("three");
        Assert.assertEquals(stack.peek(), "three");
        Assert.assertEquals(stack.size(), 3);
    }

    @Test
    void testPeekEmpty() {
        Assert.assertEquals(stack.peek(), null);
    }
}
