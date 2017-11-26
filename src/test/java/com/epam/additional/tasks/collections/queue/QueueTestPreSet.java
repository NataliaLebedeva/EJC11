package com.epam.additional.tasks.collections.queue;

import org.testng.annotations.BeforeMethod;

public class QueueTestPreSet {
    Queue<String> queue;

    @BeforeMethod
    public void setup() {
        queue = new Queue<>();
    }



}
