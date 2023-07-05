package com.multithreading;

public class SleepDemo2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println(i);

            }

        }catch ( Exception e){
            System.out.println(e);

        }


    }

    public static void main(String[] args){
     SleepDemo2 demo2 = new SleepDemo2();
           demo2.start();
    }
}
