package com.epam.additional.tasks.collections.examples.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StackPopTests extends StackTestsBase {

    @Test
    public void popTest() {
        String data = "dima";

        Assert.assertEquals(stack.count, 0);

        stack.push(data);

        Assert.assertEquals(stack.pop(), data);
        Assert.assertEquals(stack.count, 0);
    }

    @Test
    public void popEmptyTest() {
        Assert.assertNull(stack.pop());
    }

}
