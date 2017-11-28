package com.epam.additional.tasks.collections.stack;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class Stack<T> implements IStack<T>, Iterable<T> {
    int count;
    Object[] nodeData;

    public Stack() {
        nodeData = new Object[10];
        count = 0;
    }

    @Override
    public T pop() {
        Object res = null;
        if (count != 0) {
            count--;
            res = nodeData[count];
            nodeData[count] = null;
        }
        return (T) res;
    }

    @Override
    public void push(T item) {
        if (count == nodeData.length) {
            Object[] newData = new Object[nodeData.length * 2];
            System.arraycopy(nodeData, 0, newData, 0, nodeData.length);
            nodeData = newData;
        }
        count++;
        this.nodeData[count - 1] = item;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public T peek() {
        Object res = null;
        if (count != 0) {
            res = nodeData[count - 1];
        }
        return (T) res;
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
                return (T) nodeData[i];
            }
        };
    }
}
