package com.multithreading;

public class DaemonThreadDemo extends Thread { @Override
public void run() {
    if (Thread.currentThread().isDaemon()){
         System.out.println("daemon");
    }else {
        System.out.println("child thread");
    }

}

    public static void main(String[] args) {

        System.out.println("main thread");
        DaemonThreadDemo daemonThreadDemo = new DaemonThreadDemo();



        daemonThreadDemo.setDaemon(true);
        daemonThreadDemo.start();
    }


}
