package com.exception.uncheckedexception;

public class NumberFormatException {
    public static void main(String[] args){
        String s = "abc";
        int i= Integer.parseInt(s);//NumberFormatException
        System.out.println(s);
    }
}
