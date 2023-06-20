package com.colllection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);
        set.add(300);
        set.add(null);


       System.out.println(set);

       Iterator iterator1 = set.iterator();
       while (iterator1.hasNext()){
           System.out.println(iterator1.next());


       }



    }
}
