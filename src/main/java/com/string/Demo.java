package com.string;

public class Demo {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        System.out.println(a.equals(b));
        System.out.println(a==b);

        String arr[]={"meow","bray","moo"};
        String c ="meow";
        System.out.println(arr[0]==c);
    }
}
