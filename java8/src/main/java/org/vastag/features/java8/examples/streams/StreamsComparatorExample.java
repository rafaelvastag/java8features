package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    public static void main(String[] args) {
        System.out.println("Students sorted by Name: " + sortStudentsByName().stream().map(Student::getName).collect(Collectors.toList()));
        System.out.println("Students sorted by Gpa: " + sortStudentsByGpaDesc());
    }

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaDesc() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
}

