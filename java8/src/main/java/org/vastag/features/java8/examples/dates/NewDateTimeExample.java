package org.vastag.features.java8.examples.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("LocalDate : " + localDate);
        System.out.println("LocalTime : " + localTime);
        System.out.println("LocalDateTime : " + localDateTime);
    }
}
