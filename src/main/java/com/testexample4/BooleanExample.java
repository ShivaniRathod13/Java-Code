package com.testexample4;

public class BooleanExample {
    public static void main(String [] args)
    {
      BooleanExample p = new BooleanExample();
        p.start();
    }

    void start()
    {
        boolean b1 = false;
        boolean b2 = fix(b1);
        System.out.println(b1 + " " + b2);
    }

    boolean fix(boolean b1)
    {
        b1 = true;
        return b1;
    }
}
