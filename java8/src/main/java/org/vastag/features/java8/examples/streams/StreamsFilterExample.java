package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static void main(String[] args) {
        System.out.println("Students filter by gender: " + filterStudents());
    }

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(st -> st.getGpa() >= 3.9)
                .collect(Collectors.toList());
    }
}
