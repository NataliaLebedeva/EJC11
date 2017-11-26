package com.epam.additional.tasks.collections.queue;

public interface IQueue<T> {
    void add(T item); // adds new item to the end

    T peekFirst(); //shows head item (not removes), return NULL if empty
    T peekLast(); //shows tail item (not removes), return NULL if empty

    T poll();// removes head item, shows it, return NULL if empty

    boolean isEmpty();

    int size();
}
