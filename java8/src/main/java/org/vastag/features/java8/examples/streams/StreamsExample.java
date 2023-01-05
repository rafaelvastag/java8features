package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (s -> s.getGradeLevel() >= 3);
        Predicate<Student> studentgpaPredicate = (s -> s.getGpa() >= 3.9);

        var studentMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentPredicate)
                .filter(studentgpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.printf(String.valueOf(studentMap));
    }
}
