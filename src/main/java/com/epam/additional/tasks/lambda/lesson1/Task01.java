package com.epam.additional.tasks.lambda.lesson1;

import java.util.Arrays;
import java.util.Comparator;

public class Task01 {

    public static void main(String[] args) {
        String[] a = {"one", "two", "three", "four", "five"};

        Arrays.sort(a, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(a));

        // TODO 1. sort by length, descendant
        Arrays.sort(a, (s1, s2) -> s2.length() - s1.length());
        System.out.println(Arrays.toString(a));

        // TODO 2. sort alphabetically by second letter
        Arrays.sort(a, Comparator.comparing(s -> s.substring(1)));
        System.out.println(Arrays.toString(a));

        // TODO 3. sort by second letter only words started with 't'
        Object[] ts = Arrays.stream(a).filter(s -> s.startsWith("t")).toArray();
        Arrays.sort(ts, Comparator.comparing(s -> s.toString().substring(1)));
        System.out.println(Arrays.toString(ts));

//        Arrays.sort(Arrays.stream(a).filter(s -> s.startsWith("t")), (s1, s2) -> {
//            return s1.toString().substring(1).compareTo(s2.toString().substring(1))
//        });
//        Arrays.sort(a, (s1, s2) -> {
//            if (s1.startsWith("t"))
//                return s1.substring(1).compareTo(s2.substring(1));
//            else return 0;
//        });


        //method reference unbound Instance
        Arrays.sort(a, String::compareTo);
        System.out.println(Arrays.toString(a));


    }

}
