package com.multithreading;

public class InterruptedThreadDemo extends Thread {
    @Override
    public void run() {
        try {
     System.out.println( "A1 :" +Thread.interrupted());//true-false
           System.out.println( "A2 :" +Thread.interrupted());//true-false
        // System.out.println("B1 :"+Thread.currentThread().isInterrupted());//true->true
          //  System.out.println( "B2 :"+Thread.currentThread().isInterrupted());
            for (int i=1;i<=5;i++){
                System.out.println(i);
               Thread.sleep(1000);
              //  System.out.println("B :"+Thread.interrupted());
            }

        }catch (Exception e){
            System.out.println("Thread Interrupted :"+e);



        }

    }

    public static void main(String[] args) {
        InterruptedThreadDemo interruptedThreadDemo = new InterruptedThreadDemo();
        interruptedThreadDemo.start();
     interruptedThreadDemo.interrupt();


    }
}
