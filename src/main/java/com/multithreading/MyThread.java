package com.multithreading;
//performing signle task form multiple thread


public class MyThread extends Thread{
    @Override
    public void run() {
        //super.run();
        System.out.println("task1");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        MyThread thread1 = new MyThread();
        thread1.start();
    }
}
