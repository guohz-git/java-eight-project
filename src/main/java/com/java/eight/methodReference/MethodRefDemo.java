package com.java.eight.methodReference;

public class MethodRefDemo {

    public static String stringOp(StringFunc sf,String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "lambda add power to Java";
        //MyStringOps::strReverse 相当于实现接口方法Func()
        //(inStr)->{return new MyStringOps().strReverse(inStr)}
        String outStr = stringOp(MyStringOps::strReverse,inStr);
        System.out.println(outStr);
    }
}
