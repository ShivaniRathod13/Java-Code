package com.multithreading;

public class MultiThreadingDemo2 implements Runnable{

    @Override
    public void run() {
        System.out.println("thread");
    }
    public static void main(String[] args) {
       MultiThreadingDemo2 demo2 = new MultiThreadingDemo2();
       Thread thread = new Thread(demo2  );
       thread.start();
    }


}
