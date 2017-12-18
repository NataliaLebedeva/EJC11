package com.epam.additional.tasks.sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new LinkedList<Student>() {{
            add(new Student(18,"Dima"));
            add(new Student(19,"Petia"));
            add(new Student(16,"Natasha"));
            add(new Student(20,"Vova"));
            add(new Student(17,"Sveta"));
        }};

//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge().compareTo(o2.getAge());
//            }
//        });
//
//        Collections.sort(students, (s1, s2) -> s1.getAge().compareTo(s2.getAge()));
//
//        students.sort(Comparator.comparing(Student::getAge));
        System.out.println(students);

        TreeSet<Student> treeSet = new TreeSet<>(students);

        System.out.println(treeSet);

    }
}
