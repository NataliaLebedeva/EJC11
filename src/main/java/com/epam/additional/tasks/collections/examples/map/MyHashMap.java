package com.epam.additional.tasks.collections.examples.map;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@SuppressWarnings("unchecked")
public class MyHashMap<K, V> implements Map<K, V> {

    @Getter
    @AllArgsConstructor
    class Node<K, V> {
        int hash;
        K key;
        V value;
        Node next;
    }

    Node<K, V>[] table;

    public MyHashMap() {
        table = new Node[16];
    }

    @Override
    public void put(K key, V value) {
        int hash = MyHashMap.hash(key.hashCode());
        int index = indexFor(hash, table.length);

        Node temp = table[index];
        table[index] = new Node(hash, key, value, temp);
    }

    @Override
    public V get(K key) {
        int hash = MyHashMap.hash(key.hashCode());
        int index = indexFor(hash, table.length);

        Node temp = table[index];

        if (temp == null) {
            return null;
        }
        if (Objects.isNull(temp.next)) {
            return (V) temp.value;
        } else {
            while (!Objects.isNull(temp)) {
                if (temp.hash == hash) {
                    return (V) temp.value;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    public Collection<Collection<Node>> getBuckets() {
        Collection<Collection<Node>> values = new ArrayList<>();

        for (Node n : table) {
            ArrayList<Node> current= new ArrayList<>();
            values.add(current);

            if(!Objects.isNull(n.next)) {
                Node temp = n;
                while (!Objects.isNull(temp)) {
                    current.add(temp);
                    temp = temp.next;
                }
            }
        }

        return values;
    }

    @Override
    public Collection<V> values() {
        ArrayList<V> values = new ArrayList<>();

        for (Node n : table) {
            values.add((V) n.value);

            if(!Objects.isNull(n.next)) {
                Node temp = n.next;
                while (!Objects.isNull(temp)) {
                    values.add((V) temp.value);
                    temp = temp.next;
                }
            }
        }

        return values;
    }

    @Override
    public int size() {
        return 0;
    }

    static int hash(int h) {
        // h  - Object.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    static int indexFor(int h, int length) {
        // h - hash(), l - array.length
        return h & (length - 1);
    }
}
