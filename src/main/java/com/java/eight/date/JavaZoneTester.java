package com.java.eight.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaZoneTester {
    public static void main(String[] args) {
        ZonedDateTime date = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");

        System.out.println("Date1: "+ date);
        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: "+id);
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当期时区: " + currentZone);
    }
}
