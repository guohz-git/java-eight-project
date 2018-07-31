package com.java.eight.defaultmthod;

/**
 * more方法示例
 */
public class JavaTester {

    public static void main(String[] args) {
        Car car = new Car();
        car.print();
    }
}

interface Vehicle{
    default void print(){
        System.out.println("我是一辆车");
    }
    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}
interface FourWheele{
    default  void print(){
        System.out.println("我是一辆四轮车!");
    }
}

class Car implements Vehicle,FourWheele{
    public void print(){
        Vehicle.super.print();
        FourWheele.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }
}