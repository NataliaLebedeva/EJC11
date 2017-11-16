package com.epam.lessons.lesson16112017;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@Ann1 (x = 5)
public class AnnotationSample {
    public static void main(@Ann1 String[] args) {
        Ann1 ann1 = AnnotationSample.class.getAnnotation(Ann1.class);
        System.out.println("ann1 == null = "+ (ann1 == null));
        System.out.println("ann1.x() = " + ann1.x());

        Annotation[] annotations = AnnotationSample.class.getAnnotations();
        System.out.println("annotations.length = " + annotations.length); //reflection

        List<Integer> integers = new ArrayList<>();
        int value = 5;
        integers.add(value);
        integers.add(6);
        integers.add(5);
        integers.add(2);
        integers.add(10);

        int i = integers.get(0);
    }
}
