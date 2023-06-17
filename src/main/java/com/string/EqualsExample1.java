package com.string;

public class EqualsExample1 {
    public static void main(String args[]){
        String s1="java";
        String s2="java";
        String s3="JAVA";
        String s4="python";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//false
        System.out.println(s1.equals(s4));//false
    }

        }
