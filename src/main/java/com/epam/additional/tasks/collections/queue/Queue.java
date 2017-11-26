package com.epam.additional.tasks.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;

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
            head = newNode;
            newNode.next = tail;
            tail = newNode;
        } else {
            tail.prev = newNode;
            newNode.next = tail;
            tail = newNode;
        }
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
            count--;
            res = head.data;
            head.data = null;
            head = null;
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
        return null;
    }
}
