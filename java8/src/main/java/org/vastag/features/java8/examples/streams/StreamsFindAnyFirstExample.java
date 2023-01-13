package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAny() {
        return StudentDataBase.getAllStudents().stream().filter(st -> st.getGpa() >= 3.8).findAny();
    }

    public static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents().stream().filter(st -> st.getGpa() >= 3.8).findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> findAny = findAny();
        if (findAny.isPresent()) {
            System.out.println("The findAny result is: " + findAny.get());
        } else {
            System.out.println("No input is passed");
        }

        Optional<Student> findFirst = findFirst();
        if (findAny.isPresent()) {
            System.out.println("The findFirst result is: " + findFirst.get());
        } else {
            System.out.println("No input is passed");
        }
    }

}
