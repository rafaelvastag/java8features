package org.vastag.features.java8.examples.lambdas;

public class RunnableLambdaExample {

    public static void main(String... args) {
        /**
         * Before Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * After Java 8
         *
         * () -> {};
         */

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLambda).start();

        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLambda2).start();

        new Thread(() -> {
            System.out.println("Inside Runnable 4");
        }).start();

    }
}
