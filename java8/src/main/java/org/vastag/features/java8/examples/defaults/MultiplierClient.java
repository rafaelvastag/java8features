package org.vastag.features.java8.examples.defaults;

import java.util.Arrays;

public class MultiplierClient {
    public static void main(String[] args) {
        var multiplier = new Multiplier();
        var integers = Arrays.asList(1, 3, 5);
        System.out.println("Result is : " + multiplier.multiply(integers));
        System.out.println("Result of size is : " + multiplier.size(integers));
        System.out.println("Result of static method isEmpty is : " + IMultiplier.isEmpty(integers));
    }


}
