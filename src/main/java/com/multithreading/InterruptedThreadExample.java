package com.multithreading;

public class InterruptedThreadExample extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        InterruptedThreadExample threadExample = new InterruptedThreadExample();
        threadExample.start();
        threadExample.interrupt();
    }
}
