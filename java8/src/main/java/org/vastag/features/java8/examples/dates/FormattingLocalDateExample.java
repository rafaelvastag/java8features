package org.vastag.features.java8.examples.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate() {
        /**
         * String to a LocalDate
         */
        String date = "2018-04-28";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localdate : " + localDate);
        localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localdate format : " + localDate);

        String date1 = "20190428";
        var localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localdate2 format : " + localDate2);

        /**
         * Custom defined dateformat
         */
        String date2 = "2018|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        var localdate3 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("localdate3 format : " + localdate3);

        String date3 = "2018*04*28";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        var localdate4 = LocalDate.parse(date3, dateTimeFormatter2);
        System.out.println("localdate4 format : " + localdate4);
    }

    public static void formatLocalDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM*dd");
        LocalDate localDate = LocalDate.now();
        var formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate : " + formattedDate);
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
