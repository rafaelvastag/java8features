package org.vastag.features.java8.examples.optional;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getStudentName() {
        Optional<Student> student = Optional.of(StudentDataBase.studentSupplier.get());

        if (student.isPresent())
            return student.map(Student::getName);

        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(getStudentName().get());
    }
}
