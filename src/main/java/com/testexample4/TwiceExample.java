package com.testexample4;

public class TwiceExample {
    static int s;
    public static void main(String [] args)
    {
      TwiceExample twiceExample = new TwiceExample();
        twiceExample.start();
        System.out.println(s);
    }

    void start()
    {
        int x = 7;
        twice(x);
        System.out.print(x + " ");
    }

    void twice(int x)
    {
        x = x*2;
        s = x;
    }
}
