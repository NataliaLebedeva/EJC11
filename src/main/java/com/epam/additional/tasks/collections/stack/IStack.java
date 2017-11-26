package com.epam.additional.tasks.collections.stack;

public interface IStack<T> {
    public T pop();
    public void push(T t);
    public boolean isEmpty();
    public int size();
    public T peek();

}
