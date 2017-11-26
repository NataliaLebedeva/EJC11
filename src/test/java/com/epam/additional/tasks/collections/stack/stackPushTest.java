package com.epam.additional.tasks.collections.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class stackPushTest extends StackTestPreSet {

    @Test
    void testPushSingle() {
        Assert.assertTrue(stack.isEmpty());
        stack.push("one");
        Assert.assertEquals(stack.size(), 1);
        Assert.assertEquals(stack.peek(), "one");
    }

    @Test
    void testPush() {
        Assert.assertTrue(stack.isEmpty());
        stack.push("one");
        stack.push("two");
        stack.push("three");
        Assert.assertEquals(stack.size(), 3);
        Assert.assertEquals(stack.peek(), "three");
    }

    @Test
    void testPush13() {
        Assert.assertTrue(stack.isEmpty());
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        stack.push("six");
        stack.push("seven");
        stack.push("eight");
        stack.push("nine");
        stack.push("ten");
        stack.push("eleven");
        stack.push("eleven");
        stack.push("eleven");
        Assert.assertEquals(stack.size(), 13);
        Assert.assertEquals(stack.peek(), "eleven");
    }
}
