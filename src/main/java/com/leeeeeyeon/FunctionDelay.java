package com.leeeeeyeon;

public class FunctionDelay {

    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static void printBye() {
        System.out.println("Bye, World!");
    }

    public static void main(String[] args) {
        // printHello();
        long start = System.currentTimeMillis();
        printHello();
        long end = System.currentTimeMillis();

        long executeTimeSec = (end - start) / 1000;
        System.out.println("printHello: " + executeTimeSec + " sec");

        // printBye
        start = System.currentTimeMillis();
        printBye();
        end = System.currentTimeMillis();

        executeTimeSec = (end - start) / 1000;
        System.out.println("printHello: " + executeTimeSec + " sec");
    }
}
