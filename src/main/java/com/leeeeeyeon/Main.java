package com.leeeeeyeon;

public class Main {

    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (String arg : args) {
            System.out.println(arg);
        }
        printHello();

        long end = System.currentTimeMillis();

        long executeTimeSec = (end - start) / 1000;

        System.out.println("Execute Time: " + executeTimeSec + " sec");
    }
}
