package org.vastag.features.java8.examples.defaults;

public interface Interface2 {
    default void methodB() {
        System.out.println("Inside Method B");
    }
}
