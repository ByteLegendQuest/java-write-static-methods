package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static hello() {
        System.out.println("Hello");
    }

    public static add(int num1, int num2) {
       int sum = num1 + num2;
        return sum;
    }
}
