package com.epam.additional.tasks.lambda.lesson2;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task05 {
    public static void main(String[] args) {

        IntStream.iterate(1, i -> i * 2).limit(10).forEachOrdered(System.out::println);

        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5).map(i -> i + 1).max(Integer::compareTo);
        //generate data     //transform data    //finalize result from data
        System.out.println(max);

        OptionalInt max2 = IntStream.rangeClosed(1, 5).map(i -> i + 1).max();
        System.out.println(max2);


    }
}
