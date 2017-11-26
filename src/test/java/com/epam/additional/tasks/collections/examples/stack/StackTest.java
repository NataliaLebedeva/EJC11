package com.epam.additional.tasks.collections.examples.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StackTest extends StackTestsBase {

    @Test
    public void peekTest() {
        String data = "dima";
        stack.push(data);

        Assert.assertEquals(stack.peek(), data);
        Assert.assertEquals(stack.count, 1);
    }

    @Test
    public void sizeTest() {
        String data = "dima";

        Assert.assertEquals(stack.size(), 0);

        stack.push(data);

        Assert.assertEquals(stack.size(), 1);
    }

    @Test
    public void isEmptyTest() {
        String data = "dima";

        Assert.assertTrue(stack.isEmpty());

        stack.push(data);

        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void stackForEach() {
        stack.push("qwe 0");
        stack.push("qwe 1");
        stack.push("qwe 2");
        stack.push("qwe 3");
        stack.push("qwe 4");

        for(String e : stack) {
            System.out.println(e);
        }

        Assert.assertFalse(stack.isEmpty());
    }
}
