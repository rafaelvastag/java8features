package org.vastag.features.java8.examples.functionalInterfaces;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
    static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + ": " + activities);

    static Consumer<Student> studentConsumer = st -> {
        if (p1.and(p2).test(st))
            biConsumer.accept(st.getName(), st.getActivities());
    };

    public static void printNameAndActivities(List<Student> sts) {
        sts.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        var students = StudentDataBase.getAllStudents();
        printNameAndActivities(students);
    }
}
