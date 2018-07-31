package com.java.eight.lambda;

public class LambdaVar {
    public static void main(String[] args) {
        int num  = 1;
        //lambda 表达式不允许出现声明参数和局部变量名称一致
//        int i  = 3;
        Converter converter = (i)->System.out.println("转换值:" + i);
        converter.convert(num);
        num = 2;
        converter.convert(num);
    }
    public interface Converter{
        void convert(int i);
    }
}
