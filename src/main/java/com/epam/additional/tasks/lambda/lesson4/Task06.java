package com.epam.additional.tasks.lambda.lesson4;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task06 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i : numbers) {
            sum += 1;
        }

        sum = Arrays.stream(numbers).parallel().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int product = Arrays.stream(numbers).parallel().reduce(1, (a, b) -> a * b);
        System.out.println(product);

        System.out.println(Arrays.stream(numbers).parallel().reduce(0, Integer::sum));

        //if stream is empty:
        OptionalInt optionalInt = Arrays.stream(numbers).parallel().reduce(Integer::sum);

        OptionalInt max = Arrays.stream(numbers).reduce(Integer::max);
        System.out.println(max);

        int count = Arrays.stream(numbers).map(d -> 1).reduce(0, Integer::sum);
        System.out.println(count);
    }
}
