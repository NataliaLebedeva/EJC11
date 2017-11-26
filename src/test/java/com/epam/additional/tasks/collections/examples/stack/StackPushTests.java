package com.epam.additional.tasks.collections.examples.stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StackPushTests extends StackTestsBase {
    @Test
    public void pushTest() {
        String data = "dima";
        stack.push(data);

        Assert.assertEquals(stack.data[0], data);
        Assert.assertEquals(stack.count, 1);
    }


    @Test
    public void pushMoTest() {
        String commonData = "dima";
        int totalSize = 11;
        for (int i = 0; i < totalSize; i++) {
            stack.push(String.format("%s_%s", commonData, i));
        }

        Assert.assertEquals(stack.data.length, 20);
        Assert.assertEquals(stack.size(), totalSize);
        System.out.println(stack.peek());
    }
}
