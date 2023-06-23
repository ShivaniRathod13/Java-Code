package com.colllection.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(40);
        set.add(60);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);
        System.out.println(set);
        System.out.println("Initial Set: "+set);

        System.out.println("Reverse Set: "+set.descendingSet());

        System.out.println("Head Set: "+set.headSet(30, true));

        System.out.println("SubSet: "+set.subSet(40, false, 50, true));

        System.out.println("TailSet: "+set.tailSet(30, false));

    }
}
