package com.epam.additional.tasks.collections.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StackIsEmptySizeForEachTest extends StackTestPreSet {

    @Test
    void testIsEmpty() {
        Assert.assertTrue(stack.isEmpty());
        stack.push("one");
        Assert.assertFalse(stack.isEmpty());
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    void testSize() {
        Assert.assertEquals(stack.size(), 0);
        stack.push("one");
        Assert.assertEquals(stack.size(), 1);
        stack.pop();
        Assert.assertEquals(stack.size(), 0);
    }

    @Test
    void testForEach() {
        stack.push("qwe 1");
        stack.push("qwe 2");
        stack.push("qwe 3");
        stack.push("qwe 4");
        stack.push("qwe 5");
        for (String e : stack) {
            System.out.println(e);
        }
        Assert.assertFalse(stack.isEmpty());
    }




}
