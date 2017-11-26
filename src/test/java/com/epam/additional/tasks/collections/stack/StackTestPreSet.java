package com.epam.additional.tasks.collections.stack;

import org.testng.annotations.BeforeMethod;

public class StackTestPreSet {
    Stack<String> stack;

    @BeforeMethod
    public void setup() {
        stack = new Stack<>();
    }

}
