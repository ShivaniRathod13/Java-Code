package com.multithreading;

public class JoinThreadExample extends Thread {
    @Override
    public void run() {
        try {
            for (int i=1;i<=5;i++){
                System.out.println("child thread :"+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args)throws InterruptedException {
        JoinThreadExample joinThreadExample =new JoinThreadExample();
         joinThreadExample.start();
         joinThreadExample.join();
        try {
            for (int i=1;i<=5;i++){
                System.out.println("main thread :"+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
