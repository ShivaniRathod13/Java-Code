package com.testexample2;


public class FooTest
{
    public static void main(String args[])
    {
        class Foo
        {
            public int i = 3;
        }
        Object o = (Object)new Foo();
        Foo foo = (Foo)o;
        System.out.println("i = " + foo.i);
    }
}
