package org.vastag.features.java8.examples.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime :" + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 01, 01, 12, 10, 00);
        System.out.println("localDateTime1 : " + localDateTime1);

        /**
         * Getting the Values
         */
        System.out.println("getMinute : " + localDateTime.getMinute());
        System.out.println("getHour : " + localDateTime.getHour());
        System.out.println("DAY_OF_MONTH : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         *  Modifying the values in Local Time
         */
        System.out.println("plusDays : " + localDateTime.plusDays(2));
        System.out.println("minusDays : " + localDateTime.minusDays(2));
        System.out.println("withMonth : " + localDateTime.withMonth(2));
        System.out.println("with : " + localDateTime.with(ChronoField.MONTH_OF_YEAR, 3));
        System.out.println("firstDayOfNextMonth : " + localDateTime.with(TemporalAdjusters.firstDayOfNextMonth()));

        /**
         * Converting localdate, localtime to localdatetime and viceversa.
         */
        LocalDate localDate = LocalDate.of(2023, 01, 16);
        System.out.println("atTime : " + localDate.atTime(9, 34));

        LocalTime localTime = LocalTime.of(9, 34);
        System.out.println("atDate : " + localTime.atDate(localDate));

        LocalDateTime localDateTime2 = localTime.atDate(localDate);
        System.out.println(localDateTime2);
        System.out.println("toLocalDate: " + localDateTime2.toLocalDate());
        System.out.println("toLocalTime: " + localDateTime2.toLocalTime());
    }
}
