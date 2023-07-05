package com.testexample6;

public class AssertionErrorExample {
    public static void main(String[] args)
    {
        int x = 0;
        assert (x > 0) : "assertion failed"; /* Line 6 */
        System.out.println("finished");
    }
}
