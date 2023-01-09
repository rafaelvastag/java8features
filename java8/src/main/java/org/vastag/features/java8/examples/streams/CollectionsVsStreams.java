package org.vastag.features.java8.examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsVsStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rafael");
        names.add("jim");
        names.add("jerry");

        var x = names.stream().filter(s -> s.startsWith("j")).collect(Collectors.toList());
        var y = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println(x.getClass().getName());
        System.out.println(x);
        System.out.println(y);
    }
}
