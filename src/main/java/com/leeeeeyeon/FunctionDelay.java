package com.leeeeeyeon;

public class FunctionDelay {

    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        printHello();
        long end = System.currentTimeMillis();

        long executeTimeSec = (end - start) / 1000;

        System.out.println("Execute Time: " + executeTimeSec + " sec");
    }
}
