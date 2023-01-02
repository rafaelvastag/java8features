package org.vastag.features.java8.examples.functionalInterfaces;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        c1.accept("touppercase java 8+ version");
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesWithCondition();
    }

    public static void printStudents() {
        System.out.println("printStudents: ");
        var students = StudentDataBase.getAllStudents();
        students.forEach(c2);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities: ");
        var students = StudentDataBase.getAllStudents();
        students.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesWithCondition() {
        System.out.println("printNameAndActivitiesWithCondition: ");
        var students = StudentDataBase.getAllStudents();
        students.forEach(student ->
        {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9)
                c3.andThen(c4).accept(student);
        });
    }
}
