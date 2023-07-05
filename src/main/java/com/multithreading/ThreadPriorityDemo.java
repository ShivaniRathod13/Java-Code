package com.multithreading;

public class ThreadPriorityDemo extends Thread{
    @Override
    public void run() {
        System.out.println("child thread");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        ThreadPriorityDemo priorityDemo = new ThreadPriorityDemo();
        priorityDemo.start();
    }
}
