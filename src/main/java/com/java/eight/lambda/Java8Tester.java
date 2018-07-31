package com.java.eight.lambda;

public class Java8Tester {
    final static String saluation = "Hello! ";
    public static void main(String[] args) {
        int innerVar = 0;
        Java8Tester tester = new Java8Tester();
        //类型声明
        //JVM会自动识别 MathOperation接口里面对应的方法
        MathOperation addition = (int a ,int b) -> a + b ;
        //不带参数
        MathOperation subtraction = (a ,b) -> a - b;
        //大括号中的返回语句
        MathOperation multiplication = (int a,int b ) ->{return a * b;};
        //没有大括号及返回语句
        MathOperation division = (int a,int b) -> a / b;
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
        //不用括号
        GreetingService greetingService1 = message->
                System.out.println(saluation+message);

        //用括号
        GreetingService greetingService2 = (message) ->{
            System.out.println(saluation +message);
        };

        greetingService1.sayMessage("Runoob");
        greetingService2.sayMessage("Google");

    }


    private int operate(int a, int b, MathOperation operation) {
        return  operation.operation(a,b);
    }

}
