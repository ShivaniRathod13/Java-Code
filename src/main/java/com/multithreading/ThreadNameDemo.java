package com.multithreading;

public class ThreadNameDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
      Thread.currentThread().setName("thread");
        System.out.println(Thread.currentThread().getName());
    }
}
