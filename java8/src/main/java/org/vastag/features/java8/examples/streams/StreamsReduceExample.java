package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        var reduce = integers.stream().reduce(1, (a, b) -> a * b);
        var reduceWithoutIdentity = integers.stream().reduce((a, b) -> a * b);
        System.out.println(reduce);
        System.out.println(reduceWithoutIdentity.get());
        var st = getHighestGPAStudent();
        if (st.isPresent())
            System.out.println(st.get());
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream().reduce((s1, s2) ->
                s1.getGpa() > s2.getGpa() ? s1 : s2);
    }
}
