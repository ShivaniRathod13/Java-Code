package com.colllection.list;

import java.util.ArrayList;

public class ArraylistExample2 {
    public static void main(String args[])
    {

        ArrayList<String> al = new ArrayList<>();
        al.add("Ajay");
        al.add("Ravi");
        al.add(1, "Ravi");
        System.out.println(al.set(0,"rohit"));

        for (int i = 0; i < al.size(); i++) {

            System.out.println(al.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : al)
            System.out.print(str + " ");
    }
}
