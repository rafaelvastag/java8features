package org.vastag.features.java8.examples.functionalInterfaces;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball"));
        };

        Supplier<List<Student>> students = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is: " + studentSupplier.get());
        System.out.println("Student list is: " + students.get());
    }
}