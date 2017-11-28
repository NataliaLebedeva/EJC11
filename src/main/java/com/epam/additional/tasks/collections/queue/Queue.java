package com.epam.additional.tasks.collections.queue;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class Queue<T> implements IQueue<T>, Iterable<T> {

    private class Node {
        T data;
        Node next;
        Node prev;
    }

    private Node head;
    private Node tail;
    private int count;

    public Queue() {
        count = 0;
        head = null;
        tail = null;
    }

    @Override
    public void add(T item) {
        Node newNode = new Node();
        newNode.data = item;
        if (head == null) {
            head = newNode; //sets first node as a Head
        } else {
            tail.prev = newNode; // links added before node to current node
        }
        newNode.next = tail; // links current node to node added before
        tail = newNode; // sets flag Tail to the last added node
        count++;
    }

    @Override
    public T peekFirst() {
        return head.data;
    }

    @Override
    public T peekLast() {
        return tail.data;
    }

    @Override
    public T poll() {
        T res = null;
        if (count != 0) {
            Node temp = head.prev;
            count--;
            res = head.data;
            head = temp;
        }
        return res;
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
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            Node current = tail;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
