package org.vastag.features.java8.examples.functionalInterfaces;

import org.vastag.features.java8.examples.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        var studentlist = StudentDataBase.getAllStudents();
        studentlist.forEach(st -> biConsumer.accept(st.getName(), st.getActivities()));
    }
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a : ".concat(a).concat(", b: ").concat(b));
        };
        biConsumer.accept("Java 7", "Java 8");

        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println("Multiplication is : " + (a*b));
        };
        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("Division is : " + (a/b));
        };
        multiply.andThen(division).accept(10,5);

        nameAndActivities();
    }
}
