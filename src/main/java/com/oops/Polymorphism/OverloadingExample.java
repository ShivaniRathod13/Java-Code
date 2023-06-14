package com.oops.Polymorphism;


public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println("main");

        Calculator ref =new Calculator();
         ref.main(20);
        System.out.println(ref.sum(11,10));
        System.out.println(ref.sum(4,9,8));
        System.out.println(ref.sum(4));
        System.out.println(ref.sum(23.4,54.7));
        System.out.println( ref.sum(20,20));
        System.out.println(ref.sum(20,20,20));
        System.out.println(ref.sum(10,67,9));






    }



}
