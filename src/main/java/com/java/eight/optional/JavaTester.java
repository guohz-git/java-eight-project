package com.java.eight.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class JavaTester {
    public static void main(String[] args) {
        JavaTester tester = new JavaTester();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        //Optional.ofNullable允许传递一个null值
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println(tester.sum(a,b));
    }

    public Integer sum(Optional<Integer> a,Optional<Integer> b){
        //判断值是否存在
        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.orElse(new Integer(0));
        return value1 + value2;
    }
}
