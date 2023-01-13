package org.vastag.features.java8.examples.terminaloperations;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {

    public static void main(String[] args) {
        var toList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));

        var toSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, Collectors.toSet()));

        var nativeMethod = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());

        System.out.println("Mapping toList: " + toList);
        System.out.println("Mapping toSet: " + toSet);
        System.out.println("Mapping native: " + nativeMethod);
    }
}
