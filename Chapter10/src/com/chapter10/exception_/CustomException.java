package com.chapter10.exception_;

public class CustomException {
    public static void main(String[] args) /*throws AgeException*/ {
        int age = 180;
//要求范围在 18 – 120 之间，否则抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) {
//这里我们可以通过构造器，设置信息
            throw new AgeException("年龄需要在 18~120 之间");
        }
        System.out.println("你的年龄范围正确.");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}