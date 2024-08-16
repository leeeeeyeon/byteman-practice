package com.leeeeeyeon;

public class Hello {

    public static void main(String []args) {
        for(int x = 0; x < 1000; x = x+1) {
            try {
                Thread.sleep(1000);
                Hello.sayHello(x);
            } catch (Exception e) {
                System.out.println("Got an exception!" + e);
            }
        }
    }

    public static void sayHello(int num) throws Exception {
        try {
            num = getnum(num);
            String s=String.valueOf(num);

            System.out.println(s + ". Hello World");
        } catch (Exception e) {
            throw e;
        }
    }

    public static int getnum(int num) {
        return num;
    }
}
