package com.epam.additional.tasks.collections.examples.stack;

import org.testng.annotations.BeforeMethod;

public class StackTestsBase {
    Stack<String> stack;

    @BeforeMethod
    public void before() {
        stack = new Stack<>();
    }
}
