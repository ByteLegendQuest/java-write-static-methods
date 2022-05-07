package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static hello() {
        String output = "Hello";
    }

    public static add(int a,int b) {
        String output = Interger.toString(a+b);
    }
}
