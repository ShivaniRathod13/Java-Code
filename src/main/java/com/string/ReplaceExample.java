package com.string;

public class ReplaceExample {
    public static void main(String[] args) {

        String s1 = "java is a good language";
        System.out.println(s1.replace("is","was"));
        System.out.println(s1.replaceFirst("a","s"));
        System.out.println(s1.replaceAll("is","was"));
        System.out.println(s1.replaceAll("is(.)","was"));
        System.out.println(s1.replaceAll("is(.*)","was"));
    }


}
