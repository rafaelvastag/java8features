package org.vastag.features.java8.examples.defaults;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> students) {
        System.out.println("After sortByName : ");
        students.sort(nameComparator);
        students.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> students) {
        System.out.println("After sortByGPA : ");
        students.sort(gpaComparator);
        students.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> students) {
        System.out.println("After comparatorChaining : ");
        students.sort(gradeComparator);
        students.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> students) {
        System.out.println("After sortWithNullValues : ");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        students.sort(studentComparator);
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        var students = StudentDataBase.getAllStudents();
        System.out.println("Before Sort : ");
        students.forEach(studentConsumer);
        sortByName(students);
        comparatorChaining(students);
        sortWithNullValues(students);
    }
}
