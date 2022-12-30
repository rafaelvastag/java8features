package org.vastag.features.java8.examples.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * Before Java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                /**
                 * 0 -> equals
                 * 1 -> o1 > o2
                 * -1 -> o1 < o2
                 */
            }
        };
        System.out.println("Result of the comparation is: " + comparator.compare(3,2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparation lambda is: " + comparatorLambda.compare(3,2));

        Comparator<Integer> comparatorLambda2 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the comparation lambda 2 is: " + comparatorLambda2.compare(3,2));
    }
}
