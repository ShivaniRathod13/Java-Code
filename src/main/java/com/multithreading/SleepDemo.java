package com.multithreading;

public class SleepDemo extends Thread {

    public static void main(String[] args)throws Exception {
        for (int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(i);

        }
    }
}
