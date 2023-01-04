package org.vastag.features.java8.examples.functionalInterfaces;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
    public static void filterStudentsByGradeLevel() {
        System.out.println("filterStudentsByGradeLevel");
        var studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(st -> {
            if (p1.test(st))
                System.out.println(st);
        });
    }

    public static void filterStudentsByGpa() {
        System.out.println("filterStudentsByGpa");
        var studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(st -> {
            if (p2.test(st))
                System.out.println(st);
        });
    }

    public static void filterStudentsByGradeLevelAndGpa() {
        System.out.println("filterStudentsByGradeLevelAndGpa");
        var studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(st -> {
            if (p1.and(p2).test(st))
                System.out.println(st);
        });
    }

    public static void filterStudentsByGradeLevelAndGpaNegate() {
        System.out.println("filterStudentsByGradeLevelAndGpaNegate");
        var studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(st -> {
            if (p1.and(p2).negate().test(st))
                System.out.println("Negate: " + st);
            else
                System.out.println(st);
        });
    }


    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGpa();
        filterStudentsByGradeLevelAndGpa();
        filterStudentsByGradeLevelAndGpaNegate();
    }
}
