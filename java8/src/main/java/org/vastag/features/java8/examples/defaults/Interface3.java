package org.vastag.features.java8.examples.defaults;

public interface Interface3 {
    default void methodC() {
        System.out.println("Inside Method C");
    }
}
