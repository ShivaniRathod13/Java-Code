package com.multithreading;

public class ThreadNameDemo1 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        ThreadNameDemo1 threadNameDemo1 = new ThreadNameDemo1();
        threadNameDemo1.setName("task1");
        threadNameDemo1.start();
        ThreadNameDemo1 nameDemo1 = new ThreadNameDemo1();
        nameDemo1.setName("task2");
        nameDemo1.start();
    }
}
