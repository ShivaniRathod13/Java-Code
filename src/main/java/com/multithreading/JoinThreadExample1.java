package com.multithreading;

public class JoinThreadExample1 extends Thread{
    static Thread mainThread;
    @Override
    public void run() {
        try {
            mainThread.join();
            for (int i=1;i<=5;i++){
                System.out.println("child thread :"+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args)throws InterruptedException {
      mainThread = Thread.currentThread();
        JoinThreadExample1 joinThreadExample1 = new JoinThreadExample1();
        joinThreadExample1.start();

        try {

            for (int i=1;i<=5;i++){
                System.out.println("main thread :"+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
