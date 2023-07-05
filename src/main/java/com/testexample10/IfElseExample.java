package com.testexample10;

public class IfElseExample {

    //Function to compare String and Object and print the result
    public static void compareStringAndObject(String s, Object o) {
        if (o.equals(s)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        if (s.equals( o)) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }

    public static void main(String[] args) {
       String s = "hello";
        Object o = s;
        compareStringAndObject(s, o);


    }
}