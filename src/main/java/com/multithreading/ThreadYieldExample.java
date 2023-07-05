package com.multithreading;

public class ThreadYieldExample extends Thread{
    @Override
    public void run() {
       Thread.yield();
        for (int i =0;i<=5;i++) {
            System.out.println(Thread.currentThread().getName());

        }
    }

    public static void main(String[] args) {
        ThreadYieldExample yieldExample = new ThreadYieldExample();
         yieldExample.start();

        for (int i =0;i<=5;i++) {
            System.out.println(Thread.currentThread().getName());

        }
    }
    }

