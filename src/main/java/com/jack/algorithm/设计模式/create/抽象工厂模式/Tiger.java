package com.jack.algorithm.设计模式.create.抽象工厂模式;

public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("老虎会吃");
    }
    public void run(){
        System.out.println("老虎会跑");
    }
}