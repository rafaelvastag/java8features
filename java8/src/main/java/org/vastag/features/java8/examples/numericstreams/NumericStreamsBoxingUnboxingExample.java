package org.vastag.features.java8.examples.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integers) {
        return integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing Result : " + boxing());
        System.out.println("Unboxing Result : " + boxing());
    }
}
