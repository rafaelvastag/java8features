package org.vastag.features.java8.examples.terminaloperations;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {
    public static void groupStudentsByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupBy() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(st -> st.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1() {
        var twoLevelMapping = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(st -> st.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println(twoLevelMapping);
    }

    public static void twoLevelGrouping_2() {
        var twoLevelMapping = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));

        System.out.println(twoLevelMapping);
    }

    public static void threeArgumentGroupingBy() {
        LinkedHashMap<String, Set<Student>> threeArgumentGroupingBy = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));

        System.out.println(threeArgumentGroupingBy);
    }

    public static void calculateTopGpa() {
        var topGpa = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(topGpa);

        var topGpa2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        System.out.println(topGpa2);
    }

    public static void calculateLeastGpa() {
        var leastGpa = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));

        System.out.println(leastGpa);

        var leastGpa2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        System.out.println(leastGpa2);
    }

    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGroupBy();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        threeArgumentGroupingBy();
        calculateTopGpa();
        calculateLeastGpa();
    }
}
