package com.epam.additional.tasks.collections.examples.map;

public class Main {
    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//        map.put("three", 3);
//        map.put("four", 4);
//
//        Integer one = map.get("one");
//        Integer two = map.get("two");
//        Integer three = map.get("three");
//        Integer four = map.get("four");

        for (Integer i = 0; i < 100; i++) {
            map.put(i.toString(), i);
        }

        System.out.println(map.values());
    }
}
