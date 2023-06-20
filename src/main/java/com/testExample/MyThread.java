package com.testExample;

class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        t1.start();
        System.out.print("one. ");

        MyThread2 t2 = new MyThread2();
        t2.start();
        System.out.print("two. ");
    }

    public void run() {
        System.out.print("Thread ");
    }
}
