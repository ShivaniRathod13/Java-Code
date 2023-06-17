package com.string;

public class Immutable {
    public static void main(String[] args) {
        String s1=new String("String");
        s1.concat("object");
        System.out.println(s1);
        s1=s1.concat("is a sequence of characters");
        System.out.println(s1);

    }

}
