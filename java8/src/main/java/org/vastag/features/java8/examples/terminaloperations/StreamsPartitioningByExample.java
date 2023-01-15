package org.vastag.features.java8.examples.terminaloperations;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

    public static void partitioningBy_1() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println("partitioningMap: " + map);
    }

    public static void partitioningBy_2() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate, toSet()));

        System.out.println("partitioningMap 2: " + map);
    }

    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
    }
}
