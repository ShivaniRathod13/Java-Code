package com.multithreading;

class Medical extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("madical starts");
            Thread.sleep(4000);
            System.out.println("madical completed");

        }catch (Exception e){
            System.out.println(e);

        }
    }
}
class TestDriver extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("test driver starts");
            Thread.sleep(4000);
            System.out.println("test driver completed ");

        }catch (Exception e){
            System.out.println(e);

        }
    }
}
class Officer extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("officer work starts");
            Thread.sleep(4000);
            System.out.println(" officer work completed");

        }catch (Exception e){
            System.out.println(e);

        }
    }
}
public class LicenceDemo {
    public static void main(String[] args)throws InterruptedException {
        Medical medical = new  Medical();
        medical.start();
        medical.join();
        TestDriver testDriver = new TestDriver();
        testDriver.start();
       testDriver.join();
        Officer officer = new Officer();

    }
}
