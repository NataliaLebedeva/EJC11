package com.epam.additional.tasks.collections.examples.stack;

public interface IStack<T> {

    T pop();

    void push(T t);

    T peek();

    int size();

    boolean isEmpty();
}
