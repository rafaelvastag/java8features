package org.vastag.features.java8.examples.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = i -> {
        return i % 2 == 0;
    };
    static Predicate<Integer> p2 = i -> i % 2 == 0;
    Predicate<Integer> p3 = i -> {
        return i % 5 == 0;
    };

    public static void predicateAnd(){
        System.out.println("And: " + p.and(p2).test(10));
        System.out.println("And: " + p.and(p2).test(9));
    }

    public static void predicateOr(){
        System.out.println("Or: " + p.or(p2).test(10));
        System.out.println("Or: " + p.or(p2).test(9));
        System.out.println("Or: " + p.or(p2).test(8));
    }

    public static void predicateNegate(){
        System.out.println("Negate: " + p.negate().test(10));
    }

    public static void main(String[] args) {

        System.out.println(p.test(2));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
