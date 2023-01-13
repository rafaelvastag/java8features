package org.vastag.features.java8.examples.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {
	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 5).mapToObj(i -> i).collect(Collectors.toList());
	}

	public static long mapToLong() {
		return IntStream.rangeClosed(1, 5).mapToLong(i -> i).sum();
	}

	public static void main(String[] args) {
		System.out.println("MapToObj Result : " + mapToObj());
		System.out.println("MapToLong Result : " + mapToLong());
	}
}
