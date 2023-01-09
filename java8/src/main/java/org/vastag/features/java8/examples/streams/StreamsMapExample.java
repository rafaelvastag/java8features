package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        var studentsNames = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(studentsNames);
    }
}
