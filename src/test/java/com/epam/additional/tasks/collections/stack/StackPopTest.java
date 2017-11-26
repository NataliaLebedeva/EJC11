package com.epam.additional.tasks.collections.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StackPopTest extends StackTestPreSet {
    @Test
    void testPopSecond() {
        stack.push("one");
        stack.push("two");
        int before = stack.size();
        Assert.assertEquals(stack.pop(), "two");
        Assert.assertEquals(stack.size(), before - 1);
        Assert.assertEquals(stack.peek(), "one");
    }

    @Test
    void testPopSingle() {
        stack.push("one");
        int before = stack.size();
        Assert.assertEquals(stack.pop(), "one");
        Assert.assertEquals(stack.size(), before - 1);
    }

    @Test
    void testPopEmpty() {
        Assert.assertEquals(stack.pop(), null);
    }


}
