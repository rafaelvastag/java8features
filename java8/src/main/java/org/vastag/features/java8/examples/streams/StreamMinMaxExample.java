package org.vastag.features.java8.examples.streams;

import java.util.List;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> values) {
        return values.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }
}



