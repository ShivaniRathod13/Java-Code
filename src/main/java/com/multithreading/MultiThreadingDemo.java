package com.multithreading;

public class MultiThreadingDemo extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("thread");
    }

    public static void main(String[] args) {
        MultiThreadingDemo demo = new MultiThreadingDemo();
        demo.start();
      // demo.start();IllegalThreadStateException
        
    }
}
