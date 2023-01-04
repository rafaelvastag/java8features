package org.vastag.features.java8.examples.methodreference;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumeMethodReferenceExample {
    /**
     * classname::methodName
     */
    static Consumer<Student> c1 = System.out::println;

    /**
     * Classname::instanceMethodName
     *
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
