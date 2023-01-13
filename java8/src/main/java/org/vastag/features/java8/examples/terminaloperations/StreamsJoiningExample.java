package org.vastag.features.java8.examples.terminaloperations;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static String joining_1() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(";"));
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(";", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining method with delimiter: " + joining_1());
        System.out.println("Joining method with delimiter, prefix and sufix: " + joining_2());
    }
}
