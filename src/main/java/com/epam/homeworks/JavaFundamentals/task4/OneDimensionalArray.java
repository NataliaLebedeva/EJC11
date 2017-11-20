package com.epam.homeworks.JavaFundamentals.task4;

import java.util.ArrayList;
import java.util.List;

import static com.epam.utils.Helper.getMaxInSequence;

public class OneDimensionalArray {
    public static void main(String[] args) {
        List<Double> realVariables =  new ArrayList<Double>() {{
            add(5.6);
            add(Math.pow(3,4));
            add(5.57);
            add(Math.sin(4.2));
            add(1.3);
            add(Math.PI * 2);
        }};

        List<Double> doubles = fillSummarySequence(realVariables);
        Double max = getMaxInSequence(realVariables);
        Double maxFromSumSeq = getMaxInSequence(doubles);
        System.out.println("Max in sequence: " + max);
        System.out.println("Max in summarized sequence: " + maxFromSumSeq);

    }

    private static List<Double> fillSummarySequence (List<Double> list) {
        Double previous = 0.0;
        List<Double> summaryList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            summaryList.add(list.get(i) + previous);
            previous = summaryList.get(i);
        }
        return summaryList;
    }

}
