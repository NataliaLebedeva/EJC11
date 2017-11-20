package com.epam.homeworks.JavaFundamentals.task3;

import java.util.*;

public class CalculationOfFunction {

    public interface MyFunction<T, K> {
        K append(T t);
    }

    public static void main(String[] args) {
        MyFunction<Double, Double> func = Math::sin;
        MyFunction<Double, Double> func1 = (x) -> modifiedTangentFunction(x);
        MyFunction<Double, Double> func2 = new MyFunction<Double, Double>() {
            @Override
            public Double append(Double d) {
                return Math.cos(d);
            }
        };

        System.out.println("sinus: ");
        for (List<Double> v : getValuesOnSegment(func, 0.0d, 1.0d, 0.1d)) {
            System.out.print(v.get(0) + ", ");
        }
        System.out.println("");
        for (List<Double> v : getValuesOnSegment(func, 0.0d, 1.0d, 0.1d)) {
            System.out.print(v.get(1));
        }

        System.out.println("\n" + "cosine: ");
        for (List<Double> v : getValuesOnSegment(func2, 0.0d, 1.0d, 0.1d)) {
            System.out.print(v.get(0));
        }
        System.out.println("");
        for (List<Double> v : getValuesOnSegment(func2, 0.0d, 1.0d, 0.1d)) {
            System.out.print(v.get(1));
        }

        System.out.println("\n" + "tan: ");
        getValuesOnSegment(Math::tan, 0.0d, 1.0d, 0.1d).forEach(l -> System.out.println(l));

        System.out.println("\n" + "modified tan: ");
        getValuesOnSegment(func1, 0.0d, 1.0d, 0.1d).forEach(l -> System.out.println(l));

    }

    public static List<List<Double>> getValuesOnSegment(MyFunction<Double, Double> func, double a, double b, double h) {
        List<List<Double>> functionValues = new ArrayList<>();

        for (double i = a; i < b; i += h) {
            functionValues.add(Arrays.asList(
                    i,
                    func.append(i)
            ));
        }
        return functionValues;
    }

    private static double modifiedTangentFunction(double x) {
        return Math.tan(2 * x) - 3;
    }
}
