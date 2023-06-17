package com.string;

public class SearchCharacter {
    public static void main(String[] args) {
        String str = "Welcome";
        System.out.println(str.indexOf('e'));//1
        System.out.println(str.indexOf("el"));//1
        System.out.println(str.lastIndexOf('e'));//6
        System.out.println(str.charAt(4));//o
        System.out.println(str.contains("co"));//true
        System.out.println(str.endsWith("m"));//false
        System.out.println(str.endsWith("e"));//true

    }
}
