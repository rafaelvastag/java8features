package org.vastag.features.java8.examples.functionalInterfaces;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String, Double>> studentFunction = students -> {
        Map<String, Double> studentGrademap = new HashMap<>();
        for (Student student : students) {
            if (PredicateStudentExample.p1.test(student))
                studentGrademap.put(student.getName(), student.getGpa());
        }
        return studentGrademap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
