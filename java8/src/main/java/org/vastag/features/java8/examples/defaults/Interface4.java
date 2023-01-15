package org.vastag.features.java8.examples.defaults;

public interface Interface4 {
    default void methodA() {
        System.out.println("Inside Method A " + Interface4.class);
    }
}
