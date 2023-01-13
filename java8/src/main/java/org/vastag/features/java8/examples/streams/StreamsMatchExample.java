package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(st -> st.getGpa() >= 3.5);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream().anyMatch(st -> st.getGpa() >= 4.1);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream().noneMatch(st -> st.getGpa() >= 4.1);
    }

    public static void main(String[] args) {
        System.out.println("Result of All Match : " + allMatch());
        System.out.println("Result of Any Match : " + anyMatch());
        System.out.println("Result of None Match : " + noneMatch());
    }
}
