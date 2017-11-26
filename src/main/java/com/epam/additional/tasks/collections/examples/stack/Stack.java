package com.epam.additional.tasks.collections.examples.stack;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class Stack<T> implements IStack<T>, Iterable<T> {

    Object data[];
    int count;


    public Stack() {
        data = new Object[10];
        count = 0;
    }

    @Override
    public T pop() {
        Object res = null;
        if(0 != count) {
            count--;
            res = data[count];
            data[count] = null;
        }
        return (T) res;
    }

    @Override
    public void push(T item) {
        if(count == data.length) {
            Object newData[] = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        count++;
        this.data[count - 1] = item;
    }

    @Override
    public T peek() {
        Object res = null;
        if(0 != count) {
            res = data[count - 1];
        }
        return (T) res;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int i = count;

            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                i--;
                return (T) data[i];
            }
        };
    }
}
