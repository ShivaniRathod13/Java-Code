package com.testExample;

public class X implements Runnable {
    public static void main(String args[]) {
        /* Missing code? */

        X run = new X();
        Thread t = new Thread(run);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Thread");
    }
}

