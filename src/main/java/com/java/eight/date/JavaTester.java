package com.java.eight.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JavaTester {

    public static void main(String[] args) {
        JavaTester.testLocalDateTime();
    }

    public static void testLocalDateTime(){
        //获取当前的时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间"+currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1 : "+ date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("月: " + month.getValue() +", 日: " + day +", 秒: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        LocalDate date3 = LocalDate.of(2018, 7, 30);
        System.out.println("date3: " + date3);

        LocalTime time1 = LocalTime.of(23,00);
        System.out.println("time1:" + time1);
        // 解析字符串
        LocalTime time2 = LocalTime.parse("20:15:30");
        System.out.println("time2: " + time2);

    }
}
