package com.epam.homeworks.JavaFundamentals.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MinimumNumberInSequence {

    public static void main(String[] args) {
        Function<Double, Boolean> condition = (a) -> a < 0.03;
        List<Double> sequence = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            sequence.add(1 / (Math.pow(i + 1, 2)));
        }

        Integer valueWithCondition = getValueWithCondition(condition, sequence);
        System.out.println("Min number of element with condition is: " + valueWithCondition);
    }

    public static Integer getValueWithCondition(Function<Double, Boolean> condition,
                                               List<Double> sequence) {
        for (Double s : sequence) {
            if (condition.apply(s)) {
                return  sequence.indexOf(s);
            }
        }
        return null;
    }

}
