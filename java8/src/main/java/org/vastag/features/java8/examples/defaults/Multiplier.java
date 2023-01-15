package org.vastag.features.java8.examples.defaults;

import java.util.List;

public class Multiplier implements IMultiplier {

    @Override
    public int multiply(List<Integer> integers) {
        return integers.stream().reduce(1, (x, y) -> x * y);
    }

}
