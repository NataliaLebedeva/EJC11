package com.epam.additional.tasks.collections.examples.map;

import java.util.Collection;

public interface Map<K,V> {
    void put(K key, V value);
    V get(K key);

    Collection<V> values();

    int size();
}
