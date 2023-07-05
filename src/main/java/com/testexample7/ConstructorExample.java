package com.testexample7;
class A
{
    public A(int x){}
}
class B extends A {
    public B(int x) {
        super(x);
    }
}
public class ConstructorExample {
    public static void main (String args [])
    {
        A a = new B(1);
        System.out.println("complete");
    }
}
