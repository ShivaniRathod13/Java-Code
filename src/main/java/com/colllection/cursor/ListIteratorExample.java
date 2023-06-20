package com.colllection.cursor;

import java.util.ArrayList;
import java.util.ListIterator;

// Main class
public class ListIteratorExample {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of ArrayList class
        ArrayList al = new ArrayList();

        for (int i = 0; i < 10; i++)
            al.add(i);
        System.out.println(al);

        ListIterator ltr = al.listIterator();
        while (ltr.hasNext()) {
            int i = (Integer)ltr.next();
            System.out.println(i);

            if (i % 2 == 0) {
                // Change to odd
                i++;
                // Set method to change value
                ltr.set(i);
                // To add
                ltr.add(i);
            }
        }
        System.out.println();


        System.out.println(al);


//        System.out.println("---------------------------------");
//        while (ltr.hasPrevious()) {
//            System.out.println(ltr.previous());

//        }

    }
}