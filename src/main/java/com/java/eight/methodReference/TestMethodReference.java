package com.java.eight.methodReference;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class TestMethodReference {
    public static void main(String[] args) {
        Person [] pArr = new Person[]{
                new Person("003", LocalDate.of(2016,9,1)),
                new Person("001", LocalDate.of(2016,2,1)),
                new Person("002", LocalDate.of(2016,3,1)),
                new Person("004", LocalDate.of(2016,12,1))};
        //使用匿名内部类写法
        Arrays.sort(pArr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println(Arrays.asList(pArr));

        //Lambda表达式实现
        Arrays.sort(pArr,(Person o1,Person o2)->{
            return o1.getBirthday().compareTo(o2.getBirthday());
        });

        System.out.println(Arrays.asList(pArr));

        //使用方法引用实现调用以实现方法排序
        Arrays.sort(pArr,Person::compareByAge);

        System.out.println(Arrays.asList(pArr));

    }
}
