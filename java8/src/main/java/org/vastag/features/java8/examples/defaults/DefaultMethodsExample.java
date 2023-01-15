package org.vastag.features.java8.examples.defaults;

import java.util.*;

public class DefaultMethodsExample {
    public static void main(String[] args) {
        /**
         * Sort the list name in alphabetical order
         */

        List<String> names = Arrays.asList("Rafael", "Adam", "Jenny", "Alex", "Mike", "Dan");

        /**
         * Before Java 8
         */
        Collections.sort(names);

        System.out.println("Sorted list using Collections.Sort(): " + names);

        /**
         * After Java 8
         */

        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted list using List.Sort() : " + names);
    }
}
