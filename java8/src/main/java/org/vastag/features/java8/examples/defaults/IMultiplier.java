package org.vastag.features.java8.examples.defaults;

import java.util.List;

public interface IMultiplier {

    int multiply(List<Integer> integers);

    default int size(List<Integer> integers) {
        return integers.size();
    }

    static boolean isEmpty(List<Integer> integers) {
        return integers != null && integers.size() > 0;
    }
}
