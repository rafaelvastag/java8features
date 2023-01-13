package org.vastag.features.java8.examples.terminaloperations;

import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCoutingExample {

    public static long count() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(st -> st.getGpa() >= 3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("Count method : " + count());
    }
}
