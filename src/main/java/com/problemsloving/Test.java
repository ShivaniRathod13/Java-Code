package com.problemsloving;

public class Test {
    public static void main(String[] args) {
        String s1 ="sonali";
        String s2 = "monali";
        System.out.println(s1+s2);
        System.out.println(s1+10);
        System.out.println(s1+10+20);
        System.out.println(s1+10/2);
        System.out.println(s1.concat(s2));
        System.out.println(String.join("_",s1,s2));
    }
}
