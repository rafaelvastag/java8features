package org.vastag.features.java8.examples.lambdas;

import java.util.function.Consumer;

public class LambdaLocalVariables {
    int i = 2;

    /**
     * Local Variable
     */

    static int value = 4;

    public static void main(String[] args) {

        Consumer<Integer> c1 = (i1) -> {

            // i++ -> Different scopes;
           System.out.println( "c1: " + 2);
        };

        Consumer<Integer> c2 = (i2) -> {
            value++;
            System.out.println( "c2: " + 2 + 3);
        };

        c1.accept(2);
        c2.accept(4);
    }
}
