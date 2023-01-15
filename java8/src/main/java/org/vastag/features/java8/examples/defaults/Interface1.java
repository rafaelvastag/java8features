package org.vastag.features.java8.examples.defaults;

public interface Interface1 {
    default void methodA() {
        System.out.println("Inside Method A " + Interface1.class);
    }
}
