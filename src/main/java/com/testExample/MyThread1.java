package com.testExample;

class MyThread2 extends Thread
{
    MyThread2() {}
    MyThread2(Runnable r) {super(r); }
    public void run()
    {
        System.out.print("Inside Thread ");
    }
}
class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.print(" Inside Runnable");
    }
}
public class MyThread1 {
    public static void main(String[] args)
    {
        new MyThread2().start();
        new MyThread2(new MyRunnable()).start();
    }
}
