package org.vastag.features.java8.examples.optional;

import org.vastag.features.java8.examples.data.Bike;
import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {


    //filter
    public static void optionalFilter() {
        var studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(st -> st.getGpa() >= 4.0)
                .ifPresent(System.out::println);
    }

    //map
    public static void optionalMap() {
        var studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            var nameOptional = studentOptional
                    .filter(st -> st.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(nameOptional.get());
        }
    }

    //flatmap
    public static void optionalFlatMap() {
        var studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);

        name.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
