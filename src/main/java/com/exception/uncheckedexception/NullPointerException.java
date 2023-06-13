package com.exception.uncheckedexception;

public class NullPointerException {
     public static void main(String[] args) {
          String name = null;
          System.out.println(name.length());//NullPointerException runtimeExcception
     }


}
