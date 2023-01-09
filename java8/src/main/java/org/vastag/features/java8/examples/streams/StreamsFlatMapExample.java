package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static void main(String[] args) {
        System.out.println("PrintStudent activities: " + printStudentActivities());
        System.out.println("Print Distinct Student activities: " + printDistinctStudentActivities());
        System.out.println("Print Distinct Sorted Student activities: " + printDistinctSortedStudentActivities());
        System.out.println("Print Distinct Count Student activities: " + printDistinctCountStudentActivities());
    }

    public static List<String> printStudentActivities() {
        var activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());
        return activities;
    }

    public static List<String> printDistinctStudentActivities() {
        var activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
        return activities;
    }

    public static List<String> printDistinctSortedStudentActivities() {
        var activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        return activities;
    }
    public static long printDistinctCountStudentActivities() {
        var activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return activities;
    }
}
