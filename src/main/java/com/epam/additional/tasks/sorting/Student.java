package com.epam.additional.tasks.sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private Integer age;
    private String name;

    @Override
    public int compareTo(Student o) {
        return this.age.compareTo(o.age);
    }
}
