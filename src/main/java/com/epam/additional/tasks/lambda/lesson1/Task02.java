package com.epam.additional.tasks.lambda.lesson1;

import java.util.Arrays;

public class Task02 {
    // TODO 1. method1(x, y, d -> Math.cos(d));
    // DONE: method1(x, y, Math::cos);

    // TODO 2. someList.forEach(entry -> System.out.println(entry));            --> done

    // TODO 3. method2(a, b, c, (d1, d2) -> Math.pow(d1, d2));
    // DONE: method2(a, b, c, Math::pow);

    // TODO 4. someStream.reduce((i1, i2) -> Integer.sum(i1, i2));              --> done

    // TODO 5. method3(foo, bar, (a,b,c) -> Utils.doSomethingWith(a, b, c));
    // DONE: method3(foo, bar, Utils::doSomethingWith);

    // TODO 6. method4(() -> Math.random());
    //  DONE: method4(Math::random)

    public static void main(String[] args) {
        String[] a = {"one", "two", "three", "four", "five"};
        Arrays.stream(a).forEach(System.out::println);

        Integer[] digits = new Integer[]{2, 5, 8, 12, 3, 7, 4};
        System.out.println(Arrays.stream(digits).reduce(Integer::sum));
    }
}
