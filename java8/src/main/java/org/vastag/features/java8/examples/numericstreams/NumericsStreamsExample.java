package org.vastag.features.java8.examples.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericsStreamsExample {

    public static int sumOfNumbers(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x + y); // Effort to unboxing to convert INTEGER value to int..
    }

    public static int sumOfNumbersIntStream() {
        return IntStream.rangeClosed(1, 6) // 1,2,3,4,5,6
                .sum();
    }

    public static void main(String[] args) {
        var integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Sum of N Numbers : " + sumOfNumbers(integers));
        System.out.println("Sum of N Numbers - Stream : " + sumOfNumbersIntStream());
    }
}
