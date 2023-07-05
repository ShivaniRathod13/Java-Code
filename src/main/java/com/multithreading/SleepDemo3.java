package com.multithreading;

public class SleepDemo3 extends Thread{
    @Override
    public void run() {
        try {
            for(int i=0;i<=5; i++){
                System.out.println(i+" : "+Thread.currentThread().getName());
                  sleep(1000);


            }
        }catch (Exception e){
            System.out.println(e);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        sleep(1000);
        SleepDemo3 sleepDemo3 = new SleepDemo3();
        sleepDemo3.start();

        SleepDemo3 demo3 = new SleepDemo3();
        demo3.start();
    }
}
