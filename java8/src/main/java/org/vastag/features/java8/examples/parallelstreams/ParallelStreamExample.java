package org.vastag.features.java8.examples.parallelstreams;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResults(Supplier<Integer> sum, int numberOfTimes) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            sum.get();
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static int sumSequencialStream() {
        return IntStream.rangeClosed(1, 1000000000)
                .sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1, 1000000000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long sequentialDuration = checkPerformanceResults(ParallelStreamExample::sumSequencialStream, 20);
        System.out.println("sequentialDuration in MilliSeconds: " + sequentialDuration);

        long parallelDuration = checkPerformanceResults(ParallelStreamExample::sumParallelStream, 20);
        System.out.println("parallelDuration in MilliSeconds: " + parallelDuration);
    }
}
