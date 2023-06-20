package com.colllection.list;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample2 {

   public List<String> getStrings(){

        ArrayList<String> al = new ArrayList<>();
        al.add("Ajay");
        al.add("Ravi");
        al.add(1, "Ravi");

        return al;
    }
    public static void main(String args[])
    {

//
//        for (int i = 0; i < al.size(); i++) {
//
//            System.out.println(al.get(i) + " ");
//        }
//
//        System.out.println();
//
//        // Using the for each loop
//        for (String str : al)
//            System.out.print(str + " ");
    }
}
