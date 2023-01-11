package org.vastag.features.java8.examples.streams;

import org.vastag.features.java8.examples.data.Student;
import org.vastag.features.java8.examples.data.StudentDataBase;

public class StreamsMapReduceExample {
    private static int noOfNotebooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGradeLevel() >= 3)
                .filter(s -> s.getGender().equals("female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("Number of NoteBooks: " + noOfNotebooks());
    }
}
